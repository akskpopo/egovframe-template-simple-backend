package egovframework.bbs;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_BBS_MSTR_OPTN_M")
public class BbsMasterOptnEntity {

	@Id
	private String bbsId;
	
	private String answerAt; // char(1) not null default '',
	private String stsfdgAt; // char(1) not null default '',
	private LocalDateTime frstRegistPnttm; // datetime not null default '1900-01-01 00:00:00',
	private LocalDateTime lastUpdtPnttm; // datetime default null,
	private String frstRegisterId; // varchar(20) not null default '',
	private String lastUpdusrId; // varchar(20) default null,
}
