package egovframework.bas;

import lombok.*;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Comment;

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
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@ToString
@Entity
@Table(name="TB_SCHDUL_M")
public class SchdulEntity {
	
    @Id
    @NotNull
    @Column(name="SCHDUL_ID", length=20)
    @Comment("일정ID")
    private String schdulId;
    
    @NotNull
    @Column(name="SCHDUL_SE", length=1)
    @Comment("일정구분")
    private String schdulSe;
    
    @Column(name="SCHDUL_DEPT_ID", length=20)
    @Comment("일정부서ID")
    private String schdulDeptId;
    
    @Column(name="SCHDUL_KND_CODE", length=20)
    @Comment("일정종류코드")
    private String schdulKndCode;
    
    @Column(name="SCHDUL_BEGINDE")
    @Comment("일정시작일자")
    private LocalDateTime schdulBeginde;
    
    @Column(name="SCHDUL_ENDDE")
    @Comment("일정종료일자")
    private LocalDateTime schdulEndde;
    
    @Column(name="SCHDUL_NM", length=255)
    @Comment("일정명")
    private String schdulNm;
    
    @Column(name="SCHDUL_CN", length=2500)
    @Comment("일정종류내용")
    private String schdulCn;
    
    @Column(name="SCHDUL_PLACE", length=255)
    @Comment("일정장소")
    private String schdulPlace;
    
    @Column(name="SCHDUL_IPCR_CODE", length=1)
    @Comment("일정중요도코드")
    private String schdulIpcrCode;
    
    @Column(name="SCHDUL_CHARGER_ID", length=20)
    @Comment("일정담당자ID")
    private String schdulChargerId;
    
    @Column(name="ATCH_FILE_ID", length=20)
    @Comment("첨부파일ID")
    private String atchFileId;
    
    @Column(name="FRST_REGIST_PNTTM")
    @Comment(value="최초등록시점")
    private LocalDateTime frstRegistPnttm;
    
    @Column(name="FRST_REGISTER_ID", length=20)
    @Comment(value="최초등록자ID")
    private String frstRegisterId;
    
    @Column(name="LAST_UPDT_PNTTM")
    @Comment(value="최종수정시점")
    private LocalDateTime lastUpdtPnttm;
    
    @Column(name="LAST_UPDUSR_ID", length=20)
    @Comment(value="최종수정자ID")
    private String lastUpdUsrId;
    
    @Column(name="REPTIT_SE_CODE", length=3)
    @Comment("반복구분코드")
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