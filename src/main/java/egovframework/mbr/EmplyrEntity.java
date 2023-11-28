package egovframework.mbr;

import lombok.*;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;
import org.springframework.lang.Nullable;

/**
 * fileName       : EmplyrEntity
 * author         : hanslee
 * date           : 2023/11/27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/11/27        hanslee       최초 생성
 */

@Getter
@Setter
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name="TB_EMPLYR_M")
public class EmplyrEntity {
	
	/* ID */
    @Id
    @NotNull
    @Column(name="EMPLYR_ID", length=20)
    @Comment("사용자ID")
    private String emplyrId;
    
    /* PSWD */    
    @NotNull
    @Column(name="PASSWORD", length=200)
    @Comment("비밀번호")
    private String password;
    
    @NotNull
    @Column(name="PASSWORD_HINT", length=100)
    @Comment("비밀번호힌트")
    private String passwordHint;
    
    @NotNull
    @Column(name="PASSWORD_CNSR", length=100)
    @Comment("비밀번호정답")
    private String passwordCnsr;
    
    
    
    
    /* Employment Info - 재직 정보 */
    @Column(name="EMPL_NO", length=20)
    @Comment("사원번호")
    private String emplNo; 
    
    @Column(name="ORGNZT_ID", length=20)
    @Comment("조직ID")
    private String orgnztId;
    
    @Column(name="GROUP_ID", length=20)
    @Comment("그룹ID")
    private String groupId;
    
    @Column(name="OFCPS_NM", length=60)
    @Comment("직위명")
    private String ofcpsNm;    
    
    @Column(name="PSTINST_CODE", length=8)
    @Comment("소속기관코드")
    private String pstinstCode;
    
    @NotNull
    @Column(name="EMPLYR_STTUS_CODE", length=15)
    @Comment("사용자상태코드")
    private String emplyrSttusCode;
    
    @Column(name="ESNTL_ID", length=20)
    @Comment("") // ??????
    private String esntlId;
    
    @Column(name="CRTFC_DN_VALUE", length=20)
    @Comment("인증") // ??????
    private String crtfcDnValue;
    
    @Column(name="FXNUM", length=20)
    @Comment("팩스번호")
    private String fxnum;
    
    @Column(name="OFFM_TELNO", length=20)
    @Comment("사무실전화번호")
    private String offmTelno;
    
    
    
    
    /* Privacy Info - 기본 신상 */    
    @NotNull
    @Column(name="USER_NM", length=60)
    @Comment("사용자이름") // 자료사전에 없어 임의지칭
    private String userNm;
    
    @Column(name="IHIDNUM", length=200)
    @Comment("주민등록번호")
    private String ihidnum;
    
    @Column(name="SEXDSTN_CODE", length=1)
    @Comment("성별코드")
    private String sexdstnCode;
    
    @Column(name="BRTHDY", length=20)
    @Comment("생년월일")
    private String brthdy;
    
    @Column(name="MBTLNUM", length=20)
    @Comment("휴대전화번호")
    private String mbtlnum;
    
    @Column(name="EMAIL_ADRES", length=50)
    @Comment("이메일주소")
    private String emailAdres;
    
    @Column(name="HOUSE_ADRES", length=100)
    @Comment("자택주소")
    private String houseAdres;
    
    @Column(name="DETAIL_ADRES", length=100)
    @Comment("상세주소")
    private String detailAdres;
    
    @Column(name="ZIP", length=6)
    @Comment("우편번호")
    private String zip;

    @Column(name="AREA_NO", length=4)
    @Comment("지역번호")
    private String areaNo;
    
    @Column(name="HOUSE_MIDDLE_TELNO", length=4)
    @Comment("집중간전화번호")
    private String houseMiddleTelno;

    @Column(name="HOUSE_END_TELNO", length=4)
    @Comment("집끝전화번호")
    private String houseEndTelno;
    
    /* @Column(name="SBSCRB_DE")
    @Comment("가입일자")
    private LocalDateTime sbscrbDe; */
    

    @Builder
	public EmplyrEntity(String emplyrId, String orgnztId, String userNm, String password, String emplNo,
			String ihidnum, String sexdstnCode, String brthdy, String fxnum, String houseAdres, String passwordHint,
			String passwordCnsr, String houseEndTelno, String areaNo, String detailAdres, String zip, String offmTelno,
			String mbtlnum, String emailAdres, String ofcpsNm, String houseMiddleTelno, String groupId, String pstinstCode,
			String emplyrSttusCode, String esntlId, String crtfcDnValue/*, LocalDateTime sbscrbDe*/) {
		super();
		this.emplyrId = emplyrId;
		this.orgnztId = orgnztId;
		this.userNm = userNm;
		this.password = password;
		this.emplNo = emplNo;
		this.ihidnum = ihidnum;
		this.sexdstnCode = sexdstnCode;
		this.brthdy = brthdy;
		this.fxnum = fxnum;
		this.houseAdres = houseAdres;
		this.passwordHint = passwordHint;
		this.passwordCnsr = passwordCnsr;
		this.houseEndTelno = houseEndTelno;
		this.areaNo = areaNo;
		this.detailAdres = detailAdres;
		this.zip = zip;
		this.offmTelno = offmTelno;
		this.mbtlnum = mbtlnum;
		this.emailAdres = emailAdres;
		this.ofcpsNm = ofcpsNm;
		this.houseMiddleTelno = houseMiddleTelno;
		this.groupId = groupId;
		this.pstinstCode = pstinstCode;
		this.emplyrSttusCode = emplyrSttusCode;
		this.esntlId = esntlId;
		this.crtfcDnValue = crtfcDnValue;
		// this.sbscrbDe = sbscrbDe;
	}
    
}