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
	
    @Id
    @NotNull
    @Column(name="EMPLYR_ID", length=20)
    private String emplyrId;
    
    @Column(name="ORGNZT_ID", length=20)
    private String orgnztId;
    
    @NotNull
    @Column(name="USER_NM", length=60)
    private String userNm;
    
    @NotNull
    @Column(name="PASSWORD", length=200)
    private String password;
    
    @Column(name="EMPL_NO", length=20)
    private String emplNo;
    
    @Column(name="IHIDNUM", length=200)
    private String ihidnum;
    
    @Column(name="SEXDSTN_CODE", length=1)
    private String sexdstnCode;
    
    @Column(name="BRTHDY", length=20)
    private String brthdy;
    
    @Column(name="FXNUM", length=20)
    private String fxnum;
    
    @Column(name="HOUSE_ADRES", length=100)
    private String houseAdres;
    
    @NotNull
    @Column(name="PASSWORD_HINT", length=100)
    private String passwordHint;
    
    @NotNull
    @Column(name="PASSWORD_CNSR", length=100)
    private String passwordCnsr;
    
    @Column(name="HOUSE_END_TELNO", length=4)
    private String houseEndTelno;
    
    @Column(name="AREA_NO", length=4)
    private String areaNo;
    
    @Column(name="DETAIL_ADRES", length=100)
    private String detailAdres;
    
    @Column(name="ZIP", length=6)
    private String zip;
    
    @Column(name="OFFM_TELNO", length=20)
    private String offmTelno;
    
    @Column(name="MBTLNUM", length=20)
    private String mbtlnum;
    
    @Column(name="EMAIL_ADRES", length=50)
    private String emailAdres;
    
    @Column(name="OFCPS_NM", length=60)
    private String ofcpsNm;
    
    @Column(name="HOUSE_MIDDLE_TELNO", length=4)
    private String houseMiddleTelno;
    
    @Column(name="GROUP_ID", length=20)
    private String groupId;
    
    @Column(name="PSTINST_CODE", length=8)
    private String pstinstCode;
    
    @NotNull
    @Column(name="EMPLYR_STTUS_CODE", length=15)
    private String emplyrSttusCode;
    
    @Column(name="ESNTL_ID", length=20)
    private String esntlId;
    
    @Column(name="CRTFC_DN_VALUE", length=20)
    private String crtfcDnValue;
    
    @Column(name="SBSCRB_DE")
    private LocalDateTime sbscrbDe;

    @Builder
	public EmplyrEntity(String emplyrId, String orgnztId, String userNm, String password, String emplNo,
			String ihidnum, String sexdstnCode, String brthdy, String fxnum, String houseAdres, String passwordHint,
			String passwordCnsr, String houseEndTelno, String areaNo, String detailAdres, String zip, String offmTelno,
			String mbtlnum, String emailAdres, String ofcpsNm, String houseMiddleTelno, String groupId, String pstinstCode,
			String emplyrSttusCode, String esntlId, String crtfcDnValue, LocalDateTime sbscrbDe) {
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
		this.sbscrbDe = sbscrbDe;
	}
    
}