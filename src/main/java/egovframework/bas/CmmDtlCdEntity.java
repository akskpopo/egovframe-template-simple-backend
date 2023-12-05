package egovframework.bas;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;
import org.hibernate.annotations.GenericGenerator;

import egovframework.bas.CmmDtlCdEntity;

/**
 * fileName       : CmmDtlCdEntity
 * author         : hanslee
 * date           : 2023/11/27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/11/27        hanslee	최초 생성
 * 2023/11/30        hanslee	엔티티명 변경 및 BaseEntity 상속 추가 등
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
@ToString
@Table(name="TB_CMM_CD_D")
public class CmmDtlCdEntity extends BaseEntity {
	
    @Id // 원래 pk는 CD_ID,CD 두 개이나, pk 두 개인 경우에는 별도로 uuid를 생성하기로 함
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "cdDtlId", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name="CD_DTL_ID", length=32, nullable = false)
    @Comment("UUID")
    private String cdDtlId;
    
    /* FK */    
    @ManyToOne
    @JoinColumn(name="CD_ID", nullable = false)
    private CmmCdEntity cmmCdEntity;
    
    
    @Column(name="CD", length=15)
    @Comment("코드")
    private String cd;
    
    @Column(name="CD_NM", length=60)
    @Comment("코드명")
    private String cdNm;
    
    @Column(name="CD_DESC", length=200)
    @Comment("코드설명")
    private String cdDesc;
    
    @Column(name="USE_YN", length=1, nullable = false)
    @Comment("사용여부")
    private String useYn;

    
}