package egovframework.bbs;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_BBS_D")
public class BbsEntity {

	@Id
	private String bbsDtlId;
	
	private String nttId; // decimal(20,0) not null,
	private String bbsId; // char(20) not null,
	private BigDecimal nttNo; // decimal(20,0) default null,
	private String nttSj; // varchar(2000) default null,
	private String nttCn; // mediumtext,
	private String answerAt; // char(1) default null,
	private BigDecimal parntscttNo; // decimal(10,0) default null,
	private Integer answerLc; // int(11) default null,
	private BigDecimal sortOrdr; // decimal(8,0) default null,
	private BigDecimal rdcnt; // decimal(10,0) default null,
	private String useAt; // char(1) not null,
	private String ntceBgnde; // char(20) default null,
	private String ntceEndde; // char(20) default null,
	private String ntcrId; // varchar(20) default null,
	private String ntcrNm; // varchar(20) default null,
	private String password; // varchar(200) default null,
	private String atchFileId; // char(20) default null,
	private LocalDateTime frstRegistPnttm; // datetime not null,
	private String frstRegisterId; // varchar(20) not null,
	private LocalDateTime lastUpdtPnttm; // datetime default null,
	private String lastUpdusrId; // varchar(20) default null,
	

}
