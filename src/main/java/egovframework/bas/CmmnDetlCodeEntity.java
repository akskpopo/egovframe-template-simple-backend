package egovframework.bas;

import lombok.*;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Comment;
import org.hibernate.annotations.GenericGenerator;

/**
 * fileName       : CmmnDetlCodeEntity
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
@Table(name="TB_CMMN_DETL_CODE_M")
public class CmmnDetlCodeEntity {
	
    @Id // 원래 pk는 CODE_ID,CODE 두 개이나, pk 두 개인 경우에는 별도로 uuid를 생성하기로 함
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "cmmnDetailId", strategy = "org.hibernate.id.UUIDGenerator")
    @Comment("UUID")
    private String cmmnDetailId;
    
    @NotNull
    @JoinColumn(name="CODE_ID") // CONSTRAINT LETTCCMMNDETAILCODE_ibfk_1 FOREIGN KEY (CODE_ID) REFERENCES LETTCCMMNCODE (CODE_ID)
    @Column(name="CODE_ID", length=6)
    @Comment("코드ID")
    private String codeId;     
    
    @NotNull
    @Column(name="CODE", length=15)
    @Comment("코드")
    private String code;
    
    @Column(name="CODE_NM", length=60)
    @Comment("코드명")
    private String codeNm;
    
    @Column(name="CODE_DC", length=200)
    @Comment("코드설명")
    private String codeDc;
    
    @Column(name="USE_YN", length=1)
    @Comment("사용여부")
    private String useYn;
    

    @Column(name="FRST_REGIST_PNTTM")
    @Comment("최초등록시점")
    private LocalDateTime frstRegistPnttm;
    
    @Column(name="FRST_REGISTER_ID", length=20)
    @Comment("최초등록자ID")
    private String frstRegisterId;
    
    @Column(name="LAST_UPDT_PNTTM")
    @Comment("최종수정시점")
    private LocalDateTime lastUpdtPnttm;
    
    @Column(name="LAST_UPDUSR_ID", length=20)
    @Comment("최종수정자ID")
    private String lastUpdUsrId;    

    @Builder
	public CmmnDetlCodeEntity(String cmmnDetailId, String codeId, String code, String codeNm, String codeDc,
			String useYn, LocalDateTime frstRegistPnttm, String frstRegisterId, LocalDateTime lastUpdtPnttm,
			String lastUpdUsrId) {
		super();
		this.cmmnDetailId = cmmnDetailId;
		this.codeId = codeId;
		this.code = code;
		this.codeNm = codeNm;
		this.codeDc = codeDc;
		this.useYn = useYn;
		this.frstRegistPnttm = frstRegistPnttm;
		this.frstRegisterId = frstRegisterId;
		this.lastUpdtPnttm = lastUpdtPnttm;
		this.lastUpdUsrId = lastUpdUsrId;
	}
    
}