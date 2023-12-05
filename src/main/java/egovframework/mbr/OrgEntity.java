package egovframework.mbr;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Comment;

import egovframework.bas.BaseEntity;

/**
 * fileName       : OrgEntity
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
@Table(name="TB_ORG_M")
public class OrgEntity extends BaseEntity {
	
    @Id
    @Column(name="ORG_ID", length=20, nullable=false)
    @Comment("조직ID")
    private String orgId;
    
    @NotNull
    @Column(name="ORG_NM", length=20, nullable=false)
    @Comment("조직명")
    private String orgNm;
    
    @Column(name="ORG_DESC", length=100)
    @Comment("조직설명")
    private String orgDesc;
    
}