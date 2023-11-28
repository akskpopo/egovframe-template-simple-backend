package egovframework.mbr;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_ENTRPRS_MBR_M")
public class EntrprsMberEntity {

	@Id
	private String entrprsMberId; // varchar(20) not null default '',
	
	private String entrprsSeCode; // char(15) default null,
	private String bizrno; // varchar(10) default null,
	private String jurirno; // varchar(13) default null,
	private String cmpnyNm; // varchar(60) not null,
	private String cxfc; // varchar(50) default null,
	private String zip; // varchar(6) default null,
	private String adres; // varchar(100) default null,
	private String entrprsMiddleTelno; // varchar(4) default null,
	private String fxnum; // varchar(20) default null,
	private String indutyCode; // char(15) default null,
	private String applcntNm; // varchar(50) not null,
	private String applcntIhidnum; // varchar(200) default null,
	private LocalDateTime sbscrbDe; // datetime default null,
	private String entrprsMberSttus; // varchar(15) default null,
	private String entrprsMberPassword; // varchar(200) not null,
	private String entrprsMberPasswordHint; // varchar(100) not null,
	private String entrprsMberPasswordCnsr; // varchar(100) not null,
	private String groupId; // char(20) default null,
	private String detailAdres; // varchar(100) default null,
	private String entrprsEndTelno; // varchar(4) default null,
	private String areaNo; // varchar(4) default null,
	private String applcntEmailAdres; // varchar(50) default null,
	private String esntlId; // char(20) not null,

}
