package egovframework.mbr;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_GNRL_MBR_M")
public class GnrlMberEntity {

	@Id
	private String mberId; // varchar(20) not null default '',

	private String password; // varchar(200) not null,
	private String passwordHint; // varchar(100) not null,
	private String passwordCnsr; // varchar(100) not null,
	private String ihidnum; // varchar(200) default null,
	private String mberNm; // varchar(50) not null,
	private String zip; // varchar(6) default null,
	private String adres; // varchar(100) default null,
	private String areaNo; // varchar(4) default null,
	private String mberSttus; // varchar(15) default null,
	private String detailAdres; // varchar(100) default null,
	private String endTelno; // varchar(4) default null,
	private String mbtlnum; // varchar(20) default null,
	private String groupId; // char(20) default null,
	private String mberFxnum; // varchar(20) default null,
	private String mberEmailAdres; // varchar(50) default null,
	private String middleTelno; // varchar(4) default null,
	private LocalDateTime sbscrbDe; // datetime default null,
	private String sexdstnCode; // char(1) default null,
	private String esntlId; // char(20) not null,
}
