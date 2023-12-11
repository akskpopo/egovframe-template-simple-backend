package egovframework.let.cop.bbs.service;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 게시물에 대한 데이터 처리 모델 클래스
 * @author 공통 서비스 개발팀 이삼섭
 * @since 2009.03.06
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일      수정자          수정내용
 *  -------    --------    ---------------------------
 *  2009.03.06  이삼섭          최초 생성
 *  2011.08.31  JJY            경량환경 템플릿 커스터마이징버전 생성
 *
 *  </pre>
 */
@Schema(description = "게시물 모델")
@Getter
@Setter
public class Board implements Serializable {

	/**
	 *  serialVersion UID
	 */
	private static final long serialVersionUID = -8868310931851410226L;

	@Schema(description = "게시물 첨부파일 아이디")
	private String atchFileId = "";

	@Schema(description = "게시판 아이디")
	private String bbsId = "";

	@Schema(description = "최초등록자 아이디")
	private String dataInptId = "";

	@Schema(description = "최초등록시점")
	private String dataInptDttm = "";

	@Schema(description = "최종수정자 아이디")
	private String dataUpdId = "";

	@Schema(description = "최종수정시점")
	private String dataUpdDttm = "";

	@Schema(description = "게시시작일")
	private String ntceBgnDt = "";

	@Schema(description = "게시종료일")
	private String ntceEndDt = "";

	@Schema(description = "게시자 아이디")
	private String ntcrId = "";

	@Schema(description = "게시자명")
	private String ntcrNm = "";

	@Schema(description = "게시물 내용")
	private String nttCn = "";

	@Schema(description = "게시물 아이디")
	private long nttId = 0L;

	@Schema(description = "게시물 번호")
	private long nttNo = 0L;

	@Schema(description = "게시물 제목")
	private String nttSj = "";

	@Schema(description = "부모글번호")
	private String parnts = "0";

	@Schema(description = "패스워드")
	private String pwd = "";

	@Schema(description = "조회수")
	private int readCnt = 0;

	@Schema(description = "답장여부")
	private String rplyYn = "";

	@Schema(description = "답장위치")
	private String rplyLoc = "0";

	@Schema(description = "정렬순서(DESC,ASC)")
	private long sortOrd = 0L;

	@Schema(description = "사용여부", allowableValues = {"Y", "N"})
	private String useYn = "";
	
	@Schema(description = "게시 종료일")
	private String ntceEndDtView = "";
	
	@Schema(description = "게시 시작일")
	private String ntceBgnDtView = "";

	/**
	 * toString 메소드를 대치한다.
	 */
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
}
