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
import egovframework.bbs.BbsEntity;
import egovframework.bbs.BbsUseEntity;

/**
 * fileName       : AuthGrpEntity
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
@Table(name="TB_AUTH_GRP_M")
public class AuthGrpEntity extends BaseEntity {
	
    @Id
    @Column(name="GRP_ID", length=20, nullable=false)
    @Comment("그룹ID")
    private String grpId;
    
    @Column(name="GRP_NM", length=60, nullable=false)
    @Comment("그룹명")
    private String grpNm;
    
    @Column(name="GRP_CRTE_DT", length=20, nullable=false)
    @Comment("그룹생성일자")
    private String grpCrteDt;
    
    @Column(name="GRP_DESC", length=100)
    @Comment("그룹설명")
    private String grpDesc;
    
}