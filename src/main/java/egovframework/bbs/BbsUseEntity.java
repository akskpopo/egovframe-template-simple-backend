package egovframework.bbs;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_BBS_USE_M")
public class BbsUseEntity {
	
	@Id
	private String bbsUseId;
	
	private String bbsId; // char(20) not null,
	private String trgetId; // char(20) not null default '',
	private String useAt; // char(1) not null,
	private String registSeCode; // char(6) default null,
	private LocalDateTime frstRegistPnttm; // datetime default null,
	private String frstRegisterId; // varchar(20) not null,
	private LocalDateTime lastUpdtPnttm; // datetime default null,
	private String lastUpdusrId; // varchar(20) default null,
}
