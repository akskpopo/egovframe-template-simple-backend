package egovframework.mbr;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;

@Entity
@Table(name="TB_ENTRPRS_MBR_M")
public class EntrprsMberEntity {

	@Id
	@Column(name="ENTRPRSMBER_ID")
    @Comment("기업회원ID")
	private String entrprsMberId; // varchar(20) not null default '',
	
	
	@Column(name="ENTRPRS_MBER_PASSWORD")
    @Comment("기업회원비밀번호")
	private String entrprsMberPassword; // varchar(200) not null,
	
	@Column(name="ENTRPRS_MBER_PASSWORD_HINT")
    @Comment("기업회원비밀번호힌트")
	private String entrprsMberPasswordHint; // varchar(100) not null,
	
	@Column(name="ENTRPRS_MBER_PASSWORD_CNSR")
    @Comment("기업회원비밀번호정답")
	private String entrprsMberPasswordCnsr; // varchar(100) not null,
	
	
	@Column(name="ENTRPRS_SE_CODE")
    @Comment("기업구분코드")
	private String entrprsSeCode; // char(15) default null,
	
	@Column(name="ENTRPRS_MBER_STTUS")
    @Comment("기업회원상태")
	private String entrprsMberSttus; // varchar(15) default null,
	
	@Column(name="BIZRNO")
    @Comment("사업자번호")
	private String bizrno; // varchar(10) default null,
	
	@Column(name="JURIRNO")
    @Comment("법인등록번호")
	private String jurirno; // varchar(13) default null,
	
	@Column(name="CMPNY_NM")
    @Comment("회사명")
	private String cmpnyNm; // varchar(60) not null,
	
	@Column(name="INDUTY_CODE")
    @Comment("업종코드")
	private String indutyCode; // char(15) default null,
	
	@Column(name="CXFC")
    @Comment("대표이사")
	private String cxfc; // varchar(50) default null,
	
	
	
	
	@Column(name="ZIP")
    @Comment("우편번호")
	private String zip; // varchar(6) default null,
	
	@Column(name="ADRES")
    @Comment("주소")
	private String adres; // varchar(100) default null,
	
	@Column(name="DETAIL_ADRES")
    @Comment("상세주소")
	private String detailAdres; // varchar(100) default null,
	
	@Column(name="AREA_NO")
    @Comment("지역번호")
	private String areaNo; // varchar(4) default null,
	
	@Column(name="ENTRPRS_MIDDLE_TELNO")
    @Comment("기업중간전화번호")
	private String entrprsMiddleTelno; // varchar(4) default null,
	
	@Column(name="ENTRPRS_END_TELNO")
    @Comment("기업끝전화번호")
	private String entrprsEndTelno; // varchar(4) default null,
	
	@Column(name="FXNUM")
    @Comment("팩스번호")
	private String fxnum; // varchar(20) default null,
	
	
	
	@Column(name="APPLCNT_NM")
    @Comment("신청자명")
	private String applcntNm; // varchar(50) not null,
	
	@Column(name="APPLCNT_IHIDNUM")
    @Comment("신청자주민등록번호")
	private String applcntIhidnum; // varchar(200) default null,
	
	@Column(name="APPLCNT_EMAIL_ADRES")
    @Comment("신청자이메일주소")
	private String applcntEmailAdres; // varchar(50) default null,
	
	
	@Column(name="GROUP_ID")
    @Comment("그룹ID")
	private String groupId; // char(20) default null,
	
	@Column(name="SBSCRB_DE")
    @Comment("가입일자")
	private LocalDateTime sbscrbDe; // datetime default null,
	
	@Column(name="ESNTL_ID")
    @Comment("") // ????????
	private String esntlId; // char(20) not null,

}
