package egovframework.mbr;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * fileName       : AuthorGrpEntity
 * author         : hanslee
 * date           : 2023/11/27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/11/27        hanslee       최초 생성
 */

@Getter
@Setter
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name="TB_AUTHOR_GRP_M")
public class AuthorGrpEntity {
	
    @Id
    @NotNull
    // @ColumnDefault("") // 테이블 create 부분 상에서는 defaultValue 가 '' 이나, 우선 따르지 않기로 함
    @Column(name="GROUP_ID", length=20)
    private String groupId;
    
    @NotNull
    @Column(name="GROUP_NM", length=60)
    private String groupNm;
    
    @NotNull
    @Column(name="GROUP_CREAT_DE", length=20)
    private String groupCreatDe;
    
    @Column(name="GROUP_DC", length=100)
    private String groupDc;
    
    @Builder
	public AuthorGrpEntity(String groupId, String groupNm, String groupCreatDe, String groupDc) {
		super();
		this.groupId = groupId;
		this.groupNm = groupNm;
		this.groupCreatDe = groupCreatDe;
		this.groupDc = groupDc;
	}
    
}