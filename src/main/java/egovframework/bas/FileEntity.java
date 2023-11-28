package egovframework.bas;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_FILE_M")
public class FileEntity {
	
	@Id
	private String atchFileId; // char(20) not null,
	
	private LocalDateTime creatDt; // datetime not null,
	private String useAt; // char(1) default null,
}
