package egovframework.bas;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;

@Entity
@Table(name="TB_FILE_M")
public class FileEntity {
	
	@Id
	@Column(name="ATCH_FILE_ID")
    @Comment("첨부파일ID")
	private String atchFileId; // char(20) not null,
	
	@Column(name="CREAT_DT")
    @Comment("생성일시")
	private LocalDateTime creatDt; // datetime not null,
	
	@Column(name="USE_YN")
    @Comment("사용여부")
	private String useYn; // char(1) default null,
}
