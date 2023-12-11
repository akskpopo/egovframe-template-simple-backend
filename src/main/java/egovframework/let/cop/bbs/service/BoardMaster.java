package egovframework.let.cop.bbs.service;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 게시판 속성정보를 담기위한 엔티티 클래스
 * @author 공통 서비스 개발팀 이삼섭
 * @since 2009.03.12
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일      수정자          수정내용
 *  -------    --------    ---------------------------
 *  2009.03.12  이삼섭          최초 생성
 *  2011.08.31  JJY            경량환경 템플릿 커스터마이징버전 생성
 *
 *  </pre>
 */
@Schema(description = "게시판 속성 정보 엔티티")
@Getter
@Setter
public class BoardMaster implements Serializable {

    /**
	 * serialVersion UID
	 */
	private static final long serialVersionUID = 2821358749509367821L;

	@Schema(description = "게시판 속성코드")
    private String bbsAttrCd = "";

	@Schema(description = "게시판 아이디")
    private String bbsId = "";

	@Schema(description = "게시판 소개")
    private String bbsIntrcn = "";

	@Schema(description = "게시판 명")
    private String bbsNm = "";

	@Schema(description = "게시판 유형코드")
    private String bbsKdCd = "";

	@Schema(description = "파일첨부가능여부")
    private String fileAtchPsblYn = "";

	@Schema(description = "최초등록자 아이디")
    private String dataInptId = "";

	@Schema(description = "최초등록시점")
    private String dataInptDttm = "";

	@Schema(description = "최종수정자 아이디")
    public String dataUpdId = "";

	@Schema(description = "최종수정시점")
    private String dataUpdDttm = "";

	@Schema(description = "첨부가능파일숫자")
    private int psblAtchFileNum = 0;

	@Schema(description = "첨부가능파일사이즈")
    private String psblAtchFileSize = "";

	@Schema(description = "답장가능여부")
    private String rplyPsblYn = "";

	@Schema(description = "템플릿 아이디")
    private String tmpltId = "";

	@Schema(description = "사용여부")
    private String useYn = "";

	@Schema(description = "사용플래그")
    private String bbsUseFlag = "";

	@Schema(description = "대상 아이디")
    private String trgtId = "";

	@Schema(description = "등록구분코드")
    private String regKdCd = "";

	@Schema(description = "유일 아이디")
    private String uniqId = "";

	@Schema(description = "템플릿 명")
    private String tmpltNm = "";

    //---------------------------------
    // 2009.06.26 : 2단계 기능 추가
    //---------------------------------
	@Schema(description = "추가 option (댓글-comment, 만족도조사-stsfdg)")
    private String option = "";

	@Schema(description = "댓글 여부")
    private String commentAt = "";

	@Schema(description = "만족도조사")
    private String stsfdgAt = "";
    ////-------------------------------

    /**
     * toString 메소드를 대치한다.
     */
    public String toString() {
	return ToStringBuilder.reflectionToString(this);
    }
}