package egovframework.bas;

import lombok.*;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * fileName       : SchdulEntity
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
@Table(name="TB_SCHDUL_M")
public class SchdulEntity {
	
    @Id
    @NotNull
    @Column(name="SCHDUL_ID", length=20)
    private String schdulId;
    
    @NotNull
    @Column(name="SCHDUL_SE", length=1)
    private String schdulSe;
    
    @Column(name="SCHDUL_DEPT_ID", length=20)
    private String schdulDeptId;
    
    @Column(name="SCHDUL_KND_CODE", length=20)
    private String schdulKndCode;
    
    @Column(name="SCHDUL_BEGINDE")
    private LocalDateTime schdulBeginde;
    
    @Column(name="SCHDUL_ENDDE")
    private LocalDateTime schdulEndde;
    
    @Column(name="SCHDUL_NM", length=255)
    private String schdulNm;
    
    @Column(name="SCHDUL_CN", length=2500)
    private String schdulCn;
    
    @Column(name="SCHDUL_PLACE", length=255)
    private String schdulPlace;
    
    @Column(name="SCHDUL_IPCR_CODE", length=1)
    private String schdulIpcrCode;
    
    @Column(name="SCHDUL_CHARGER_ID", length=20)
    private String schdulChargerId;
    
    @Column(name="ATCH_FILE_ID", length=20)
    private String atchFileId;
    
    @Column(name="FRST_REGIST_PNTTM")
    private LocalDateTime frstRegistPnttm;
    
    @Column(name="FRST_REGISTER_ID", length=20)
    private String frstRegisterId;
    
    @Column(name="LAST_UPDT_PNTTM")
    private LocalDateTime lastUpdtPnttm;
    
    @Column(name="LAST_UPDUSR_ID", length=20)
    private String lastUpdUsrId;
    
    @Column(name="REPTIT_SE_CODE", length=3)
    private String reptitSeCode;


    @Builder
    public SchdulEntity(String schdulId, String schdulSe, String schdulDeptId, String schdulKndCode,
		LocalDateTime schdulBeginde, LocalDateTime schdulEndde, String schdulNm, String schdulCn, String schdulPlace,
		String schdulIpcrCode, String schdulChargerId, String atchFileId, LocalDateTime frstRegistPnttm,
		String frstRegisterId, LocalDateTime lastUpdtPnttm, String lastUpdUsrId, String reptitSeCode) {
    	
		super();
		this.schdulId = schdulId;
		this.schdulSe = schdulSe;
		this.schdulDeptId = schdulDeptId;
		this.schdulKndCode = schdulKndCode;
		this.schdulBeginde = schdulBeginde;
		this.schdulEndde = schdulEndde;
		this.schdulNm = schdulNm;
		this.schdulCn = schdulCn;
		this.schdulPlace = schdulPlace;
		this.schdulIpcrCode = schdulIpcrCode;
		this.schdulChargerId = schdulChargerId;
		this.atchFileId = atchFileId;
		this.frstRegistPnttm = frstRegistPnttm;
		this.frstRegisterId = frstRegisterId;
		this.lastUpdtPnttm = lastUpdtPnttm;
		this.lastUpdUsrId = lastUpdUsrId;
		this.reptitSeCode = reptitSeCode;
    }
    
}