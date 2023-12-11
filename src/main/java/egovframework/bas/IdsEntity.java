package egovframework.bas;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * fileName       : IdsEntity
 * author         : shchun
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
@Table(name="IDS")
public class IdsEntity extends BaseEntity {
	
	@Id
	@Column(name="TABLE_NAME", length=20, nullable=false)
    @Comment("테이블명")
	private String tbNm;
	
	@Column(name="NEXT_ID", precision=30 , scale=0, nullable=false)
	@ColumnDefault("0")
    @Comment("순번")
	private BigDecimal nextId;
}
