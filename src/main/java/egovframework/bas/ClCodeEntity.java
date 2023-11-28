package egovframework.bas;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_CL_CODE_M")
public class ClCodeEntity {

	@Id
	private String clCode;
	
	private String clCodeNm;
	private String clCodeDc;
	private String useAt;
	
}
