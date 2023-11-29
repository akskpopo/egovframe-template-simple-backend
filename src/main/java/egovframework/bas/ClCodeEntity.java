package egovframework.bas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name="TB_CL_CODE_M")
public class ClCodeEntity {

	@Id
	@Column(name="CL_CODE")
    @Comment("분류코드")
	private String clCode;

	@Column(name="CL_CODE_NM")
    @Comment("분류코드명")
	private String clCodeNm;

	@Column(name="CL_CODE_DC")
    @Comment("분류코드설명")
	private String clCodeDc;
	
	@Column(name="USE_YN")
    @Comment("사용여부")
	private String useYn; // 원래는 useAt, 사용 편의성을 위해 Yn으로 변경
	
}
