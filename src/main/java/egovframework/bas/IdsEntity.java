package egovframework.bas;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_IDS_M")
public class IdsEntity {
	@Id
	private String tableName;
	private BigDecimal nextId;
}
