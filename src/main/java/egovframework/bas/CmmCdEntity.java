package egovframework.bas;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;

/**
 * fileName       : CmmCdEntity
 * author         : hanslee
 * date           : 2023/11/27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/11/27        hanslee       최초 생성
 * 2023/11/30        hanslee	엔티티명 변경 및 BaseEntity 상속 추가 등
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
@ToString
@Table(name="TB_CMM_CD_M")
public class CmmCdEntity extends BaseEntity {
	
    @Id
    @Column(name="CD_ID", length=6, nullable = false)
    @Comment(value="코드ID")
    private String cdId;
    
    @Column(name="CD_ID_NM", length=60)
    @Comment(value="코드ID명")
    private String cdIdNm;
    
    @Column(name="CD_ID_DESC", length=200)
    @Comment(value="코드ID명설명")
    private String codeIdDesc;
    
    @Column(name="USE_YN", length=1, nullable = false)
    @Comment(value="사용여부")
    private String useYn; // 원래는 useAt, 사용 편의성을 위해 Yn으로 변경
    
    
    /* FK */    
    @ManyToOne
    @JoinColumn(name="CL_CD", nullable = false)
    private ClCdEntity clCdEntity;
    
    
}