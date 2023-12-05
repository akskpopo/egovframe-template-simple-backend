package egovframework.bas;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;
import org.hibernate.annotations.GenericGenerator;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * fileName       : FileDtlEntity
 * author         : hanslee
 * date           : 2023/11/27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/11/27        shchun		최초 생성
 * 2023/11/30        hanslee	엔티티명 변경 및 BaseEntity 상속 추가 등
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
@ToString
@Table(name="TB_FILE_D")
public class FileDtlEntity extends BaseEntity {

	@Id /* PRIMARY KEY (ATCH_FILE_ID,FILE_SN) 를 대체하는 UUID */
	@GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "fileDtlId", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="FILE_DTL_ID", length=32, nullable = false)
    @Comment("UUID")
	private String fileDtlId;
	
	/* 원래의 PK1, FK */    
    @ManyToOne
    @JoinColumn(name="ATCH_FILE_ID", nullable = false)
    private FileEntity fileEntity;
    
    /* 원래의 PK2 */  
	@Column(name="FILE_SN", precision=10, scale=0, nullable = false)
    @Comment("파일연번")
	private BigDecimal fileSn; // decimal(10,0) not null,
	
	
	
	@Column(name="FILE_SAV_LOC", length=2000)
    @Comment("파일저장경로")
	private String fileSavLoc; // varchar(2000) not null,
	
	@Column(name="SAVE_FILE_NM", length=255)
    @Comment("저장파일명")
	private String saveFileNm; // varchar(255) not null,
	
	@Column(name="ORGI_FILE_NM", length=255)
    @Comment("원파일명")
	private String orgiFileNm; // varchar(255) default null,
	
	@Column(name="FILE_EXTSN", length=20)
    @Comment("파일확장자")
	private String fileExtsn; // varchar(20) not null,
	
	@Column(name="FILE_CN", columnDefinition="TEXT") // mediumtext (16777215 byte)
    @Comment("파일내용")
	private String fileCn; 
	
	@Column(name="FILE_SIZE", precision=8, scale=0, nullable = false)
    @Comment("파일사이즈")
	private BigDecimal fileSize; // decimal(8,0) default null,

}
