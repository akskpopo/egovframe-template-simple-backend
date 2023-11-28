package egovframework.bas;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;

@Entity
@Table(name="TB_IDS_M")
public class IdsEntity {
	
	@Id
	@Column(name="TABLE_NAME")
    @Comment("테이블명")
	private String tableName;
	
	@Column(name="NEXT_ID")
    @Comment("순번")
	private BigDecimal nextId;
}
