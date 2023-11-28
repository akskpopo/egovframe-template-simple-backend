package egovframework.mbr;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Comment;

/**
 * fileName       : OrgnztEntity
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
@Table(name="TB_ORGNZT_M")
public class OrgnztEntity {
	
    @Id
    @NotNull
    // @ColumnDefault("") // 테이블 create 부분 상에서는 defaultValue 가 '' 이나, 우선 따르지 않기로 함
    @Column(name="ORGNZT_ID", length=20)
    @Comment("조직ID")
    private String orgnztId;
    
    @NotNull
    @Column(name="ORGNZT_NM", length=20)
    @Comment("조직명")
    private String orgnztNm;
    
    @Column(name="ORGNZT_DC", length=100)
    @Comment("조직설명")
    private String orgnztDc;
    
    @Builder
	public OrgnztEntity(String orgnztId, String orgnztNm, String orgnztDc) {
		super();
		this.orgnztId = orgnztId;
		this.orgnztNm = orgnztNm;
		this.orgnztDc = orgnztDc;
	}
    
}