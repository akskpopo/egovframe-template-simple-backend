package egovframework.bas;

import lombok.*;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * fileName       : CmmnCodeEntity
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
@Table(name="TB_CMMN_CODE_M")
public class CmmnCodeEntity {
	
    @Id
    @NotNull
    @Column(name="CODE_ID", length=6)
    private String codeId;
    
    @Column(name="CODE_ID_NM", length=60)
    private String codeIdNm;
    
    @Column(name="CODE_ID_DC", length=200)
    private String codeIdDc;
    
    @Column(name="USE_AT", length=1)
    private String useAt;
    
    @JoinColumn(name="CL_CODE")
    @Column(name="CL_CODE", length=3)
    private String clCode; // KEY R_179 (CL_CODE) ????
    
    @Column(name="FRST_REGIST_PNTTM")
    private LocalDateTime frstRegistPnttm;
    
    @Column(name="FRST_REGISTER_ID", length=20)
    private String frstRegisterId;
    
    @Column(name="LAST_UPDT_PNTTM")
    private LocalDateTime lastUpdtPnttm;
    
    @Column(name="LAST_UPDUSR_ID", length=20)
    private String lastUpdUsrId;

    @Builder
	public CmmnCodeEntity(String codeId, String codeIdNm, String codeIdDc, String useAt, String clCode,
			LocalDateTime frstRegistPnttm, String frstRegisterId, LocalDateTime lastUpdtPnttm, String lastUpdUsrId) {
		super();
		this.codeId = codeId;
		this.codeIdNm = codeIdNm;
		this.codeIdDc = codeIdDc;
		this.useAt = useAt;
		this.clCode = clCode;
		this.frstRegistPnttm = frstRegistPnttm;
		this.frstRegisterId = frstRegisterId;
		this.lastUpdtPnttm = lastUpdtPnttm;
		this.lastUpdUsrId = lastUpdUsrId;
	}
    
}