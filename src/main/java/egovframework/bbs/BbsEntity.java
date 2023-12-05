package egovframework.bbs;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;

import egovframework.bas.BaseEntity;
import egovframework.bas.FileEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * fileName       : BbsEntity
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
@Table(name="TB_BBS_M")
public class BbsEntity extends BaseEntity {
	
	@Id
	@Column(name="BBS_ID", length=20, nullable=false)
    @Comment("게시판ID")
	private String bbsId; // char(20) not null, 
	
	@Column(name="BBS_NM", length=255, nullable=false)
    @Comment("게시판명")
	private String bbsNm; // varchar(255) not null,
	
	@Column(name="BBS_DESC", length=2400)
    @Comment("게시판설명")
	private String bbsDesc; // varchar(2400) default null,
	
	@Column(name="BBS_KD_CD", length=6)
    @Comment("게시판유형코드")
	private String bbsKdCd; // char(6) not null,
	
	@Column(name="BBS_ATTR_CD", length=6)
    @Comment("게시판속성코드")
	private String bbsAttrCd; // char(6) not null,
	
	@Column(name="RPLY_PSBL_YN", length=1, nullable=false)
    @Comment("답변가능여부")
	private String rplyPsblYn; // char(1) default null,
	
	@Column(name="FILE_ATCH_PSBL_YN", length=1, nullable=false)
    @Comment("파일첨부가능여부")
	private String fileAtchPsblYn; // char(1) not null,
	
	@Column(name="ATCH_PSBL_FILE_NUM", precision=2, scale=0, nullable=false)
    @Comment("파일첨부가능개수")
	private BigDecimal atchPsblFileNumber; // decimal(2,0) not null,
	
	@Column(name="ATCH_PSBL_FILE_SIZE", precision=8, scale=0)
    @Comment("파일첨부가능용량")
	private BigDecimal atchPsblFileSize; // decimal(8,0) default null,
	
	@Column(name="USE_YN", length=1, nullable=false)
    @Comment("사용여부")
	private String useYn; // char(1) not null,
	
	@Column(name="TMPLT_ID")
    @Comment("템플릿ID")
	private String tmpltId; // char(20) default null,
	

}
