package egovframework.bas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * fileName       : ClCdEntity
 * author         : hanslee
 * date           : 2023/11/27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/11/27        shchun		최초 생성
 * 2023/11/30        hanslee	엔티티명 변경 및 BaseEntity 상속 추가 등
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
@ToString
@Table(name="TB_CL_CD_M")
public class ClCdEntity extends BaseEntity {

	@Id
	@Column(name="CL_CD", length=3, nullable = false)
    @Comment("분류코드")
	private String clCd;

	@Column(name="CL_CD_NM", length=60)
    @Comment("분류코드명")
	private String clCdNm;

	@Column(name="CL_CD_DESC", length=200)
    @Comment("분류코드설명")
	private String clCdDesc;
	
	@Column(name="USE_YN", length=1, nullable = false)
    @Comment("사용여부")
	private String useYn; // 원래는 useAt, 사용 편의성을 위해 Yn으로 변경
	
}
