package egovframework.bas;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_FILE_D")
public class FileDetailEntity {

	@Id
	private String fileDtlId;
	
	private String atchFileId; // char(20) not null,
	private BigDecimal fileSn; // decimal(10,0) not null,
	private String fileStreCours; // varchar(2000) not null,
	private String streFileNm; // varchar(255) not null,
	private String orignlFileNm; // varchar(255) default null,
	private String fileExtsn; // varchar(20) not null,
	private String fileCn; // mediumtext,
	private BigDecimal fileSize; // decimal(8,0) default null,

}
