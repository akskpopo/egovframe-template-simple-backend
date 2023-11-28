package egovframework.bbs;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_BBS_M")
public class BbsMasterEntity {
	
	@Id
	private String bbsId; // char(20) not null, 
	
	private String bbsNm; // varchar(255) not null,
	private String bbsIntrcn; // varchar(2400) default null,
	private String bbsTyCode; // char(6) not null,
	private String bbsAttrbCode; // char(6) not null,
	private String replyPosblAt; // char(1) default null,
	private String fileAtchPosblAt; // char(1) not null,
	private BigDecimal atchPosblFileNumber; // decimal(2,0) not null,
	private BigDecimal atchPosblFileSize; // decimal(8,0) default null,
	private String useAt; // char(1) not null,
	private String tmplatId; // char(20) default null,
	private String frstRegisterId; // varchar(20) not null,
	private LocalDateTime frstRegistPnttm; // datetime not null,
	private String lastUpdusrId; // varchar(20) default null,
	private LocalDateTime lastUpdtPnttm; // datetime default null,
}
