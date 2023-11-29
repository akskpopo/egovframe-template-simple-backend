package egovframework.bas;

import lombok.*;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Comment;

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
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@ToString
@Entity
@Table(name="TB_CMMN_CODE_M")
public class CmmnCodeEntity {
	
    @Id
    @NotNull
    @Column(name="CODE_ID", length=6)
    @Comment(value="코드ID")
    private String codeId;
    
    @Column(name="CODE_ID_NM", length=60)
    @Comment(value="코드ID명")
    private String codeIdNm;
    
    @Column(name="CODE_ID_DC", length=200)
    @Comment(value="코드ID명설명")
    private String codeIdDc;
    
    @Column(name="USE_YN", length=1)
    @Comment(value="사용여부")
    private String useYn; // 원래는 useAt, 사용 편의성을 위해 Yn으로 변경
    
    @JoinColumn(name="CL_CODE", referencedColumnName ="CL_CODE")
    @Column(name="CL_CODE", length=3)
    @Comment(value="분류코드")
    private String clCode; // KEY R_179 (CL_CODE) ????
    
    
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

    
    @Builder
	public CmmnCodeEntity(String codeId, String codeIdNm, String codeIdDc, String useYn, String clCode,
			LocalDateTime frstRegistPnttm, String frstRegisterId, LocalDateTime lastUpdtPnttm, String lastUpdUsrId) {
		super();
		this.codeId = codeId;
		this.codeIdNm = codeIdNm;
		this.codeIdDc = codeIdDc;
		this.useYn = useYn;
		this.clCode = clCode;
		this.frstRegistPnttm = frstRegistPnttm;
		this.frstRegisterId = frstRegisterId;
		this.lastUpdtPnttm = lastUpdtPnttm;
		this.lastUpdUsrId = lastUpdUsrId;
	}
    
}