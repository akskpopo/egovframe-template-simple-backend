package egovframework.let.cop.com.service;

import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import egovframework.let.cop.bbs.web.EgovBBSAttributeManageApiController;
import lombok.extern.slf4j.Slf4j;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * 
 * @FileName  	: AuthKeyService.java 
 * @Project		: fmss-svc 
 * @Date		: 2023. 12. 5. 
 * @author		: hanslee 

 * @version : 1.0
 * @program info : 인증키와 관련된 호출 처리를 실행한다.
 */

@Slf4j
@SpringBootApplication
@Service
public class AuthKeyService {
	
	/**
	 * 
	 * @Method Name  : reissueAuthKey 
	 * @date : 2023. 12. 5. 
	 * @author : hanslee 
	 * @version : 0.1
	 * @Method info : 키 발급 요청이 들어온 경우, 전달받은 파라미터로 새 인증키를 생성한다. IN/OUT 모두 base64Encode 처리한다.
	 * @param cid
	 * @param cpwd
	 * @return newAccessToken
	 * @throws Exception
	 */
	public String reissueAuthKey(String cid, String cpwd) throws Exception {
		
		/** 1. client id, pwd Base64 process **/ 
		String cidDecode = new String(Base64.getDecoder().decode(cid));
		String cpwdDecode = new String(Base64.getDecoder().decode(cpwd));		
		
		StringBuilder basicKey = new StringBuilder();
		basicKey.append("Basic ");
		basicKey.append(cidDecode);
		basicKey.append(":");
		basicKey.append(cpwdDecode);		
		
		String basicKeyBase64 = Base64.getEncoder().encodeToString(basicKey.toString().getBytes());
		// log.info("basicKeyBase64 : {}", basicKeyBase64);
		
		
		/** 2. Request process **/
		MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
		RequestBody body = RequestBody.create(mediaType, "grant_type=client_credentials");
		
		Request request = new Request.Builder()
			.url("http://101.79.81.129:85/auth/token")
			.method("POST", body)
			.addHeader("Content-Type", "application/x-www-form-urlencoded")
			.addHeader("Accept", "*/*")
			.addHeader("Cache-Control", "no-cache")
			.addHeader("Host", "101.79.81.129:85")
			.addHeader("Accept-Encoding", "gzip, deflate, br")
			.addHeader("Connection", "keep-alive")
			.addHeader("Content-Length", "29")
			.addHeader("Authorization", basicKeyBase64) 
			.build();
		
				
		/** 3. Response process **/
		Map<String, Object> resultMap = processResponse(request);
		String newTkn = (String) resultMap.get("access_token");	
		
		String newAccessToken = Base64.getEncoder().encodeToString(newTkn.getBytes());
		// log.info("newAccessToken : {}", newAccessToken);

		return newAccessToken;
	}
	
	

	/**
	 * 
	 * @Method Name  : processResponse 
	 * @date : 2023. 12. 5. 
	 * @author : hanslee 
	 * @version : 1.0
	 * @Method info : 각 api별 개별 세팅되는 request 를 받아, 공통 http 로직으로 response 를 반환한다. 
	 * @param request
	 * @return 응답값 Map
	 */
	public Map<String, Object> processResponse(Request request) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
			
		try {			
			OkHttpClient client = new OkHttpClient().newBuilder().build();
			
			Response response = client.newCall(request).execute();
			
			if (response.isSuccessful() && response.body() != null) {
				String jsonData = response.body().string(); // response.body.string()은 딱 한번만 호출이 되어야 한다
				response.body().close();
				
				// jsonData 의 type 확인 - object(단건)인가 array(배열)인가 - 참조 : https://okky.kr/questions/343167
				Object json = new JSONTokener(jsonData).nextValue();
				
				JSONObject jObj = new JSONObject();
				
				if (json instanceof JSONObject) { // 받은 값이 object일 경우, object 추출
					jObj = new JSONObject(jsonData);
					
				} else if (json instanceof JSONArray) {	// 받은 값이 array일 경우, array(i) 의 값을 object로 추출
					// 현재는 임시로 단 건을 추출하도록 샘플링 하였으나, 추후에 다 건의 json이 담긴 JSONArray인 경우에 JsonParser 등을 이용해서 처리하는 로직 추가해줄 것
					JSONArray jArray = new JSONArray(jsonData);
					jObj = jArray.getJSONObject(0); 
				}
				
				Iterator<String> keyIt = jObj.keys();
				String key = null;
				
				 while (keyIt.hasNext()) {
		            key = keyIt.next ();
		            resultMap.put(key, jObj.get(key));
			    }
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultMap;
	}

	

}