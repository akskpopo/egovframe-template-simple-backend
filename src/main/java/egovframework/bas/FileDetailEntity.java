package egovframework.bas;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;

@Entity
@Table(name="TB_FILE_D")
public class FileDetailEntity {

	@Id
	@Column(name="FILE_DTL_ID")
    @Comment("UUID")
	private String fileDtlId;
	
	@Column(name="ATCH_FILE_ID")
    @Comment("첨부파일ID")
	private String atchFileId; // char(20) not null,
	
	@Column(name="FILE_SN")
    @Comment("파일연번")
	private BigDecimal fileSn; // decimal(10,0) not null,
	
	@Column(name="FILE_STRE_COURS")
    @Comment("파일저장경로")
	private String fileStreCours; // varchar(2000) not null,
	
	@Column(name="STRE_FILE_NM")
    @Comment("저장파일명")
	private String streFileNm; // varchar(255) not null,
	
	@Column(name="ORIGNL_FILE_NM")
    @Comment("원파일명")
	private String orignlFileNm; // varchar(255) default null,
	
	@Column(name="FILE_EXTSN")
    @Comment("파일확장자")
	private String fileExtsn; // varchar(20) not null,
	
	@Column(name="FILE_CN")
    @Comment("파일내용")
	private String fileCn; // mediumtext,
	
	@Column(name="FILE_SIZE")
    @Comment("파일사이즈")
	private BigDecimal fileSize; // decimal(8,0) default null,

}
