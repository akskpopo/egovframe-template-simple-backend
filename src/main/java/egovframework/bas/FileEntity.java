package egovframework.bas;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * fileName       : FileEntity
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
@Table(name="TB_FILE_M")
public class FileEntity  extends BaseEntity {
	
	@Id
	@Column(name="ATCH_FILE_ID", length=20, nullable = false)
    @Comment("첨부파일ID")
	private String atchFileId; // char(20) not null,
	
	@Column(name="CRET_DT", nullable = false)
    @Comment("생성일시")
	private LocalDateTime cretDt; // datetime not null,
	
	@Column(name="USE_YN", length=1, nullable = false)
    @Comment("사용여부")
	private String useYn;
	
	/* fileEntity : FileDtlEntity 일대다 양방향 관계 명시 */
	@OneToMany(mappedBy = "fileEntity")
	private List<FileDtlEntity> fileDtlEntity = new ArrayList<FileDtlEntity>();
	
	
}
