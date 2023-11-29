package egovframework.mbr;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name="TB_GNRL_MBR_M")
public class GnrlMberEntity {

	@Id
	@Column(name="MBER_ID")
    @Comment("회원ID")
	private String mberId; // varchar(20) not null default '',

	
	@Column(name="PASSWORD")
    @Comment("비밀번호")
	private String password; // varchar(200) not null,

	@Column(name="PASSWORD_HINT")
    @Comment("비밀번호힌트")
	private String passwordHint; // varchar(100) not null,

	@Column(name="PASSWORD_CNSR")
    @Comment("비밀번호정답")
	private String passwordCnsr; // varchar(100) not null,
	
	@Column(name="MBER_STTUS")
    @Comment("회원상태")
	private String mberSttus; // varchar(15) default null,
	
	
	@Column(name="MBER_NM")
    @Comment("회원명")
	private String mberNm; // varchar(50) not null,
	
	@Column(name="IHIDNUM")
    @Comment("주민등록번호")
	private String ihidnum; // varchar(200) default null,
	
	@Column(name="SEXDSTN_CODE")
    @Comment("성별코드")
	private String sexdstnCode; // char(1) default null,

	
	@Column(name="MBER_EMAIL_ADRES")
    @Comment("회원이메일주소")
	private String mberEmailAdres; // varchar(50) default null,
	
	@Column(name="MBTLNUM")
    @Comment("휴대전화번호")
	private String mbtlnum; // varchar(20) default null,
	
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
	
	@Column(name="MIDDLE_TELNO")
    @Comment("중간전화번호")
	private String middleTelno; // varchar(4) default null,
	
	@Column(name="END_TELNO")
    @Comment("끝전화번호")
	private String endTelno; // varchar(4) default null,

	@Column(name="MBER_FXNUM")
    @Comment("회원팩스번호")
	private String mberFxnum; // varchar(20) default null,
	
	@Column(name="GROUP_ID")
    @Comment("그룹ID")
	private String groupId; // char(20) default null,
	
	@Column(name="SBSCRB_DE")
    @Comment("가입일자")
	private LocalDateTime sbscrbDe; // datetime default null,
	
	@Column(name="ESNTL_ID")
    @Comment("") // ???
	private String esntlId; // char(20) not null,
}
