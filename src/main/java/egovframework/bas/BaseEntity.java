package egovframework.bas;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
public class BaseEntity {

	@CreatedBy
	@Column(name="DATA_INPT_ID", updatable = false)
	private String dataInptId;

	@CreatedBy
	@Column(name="DATA_INPT_PGM", updatable = false)
	private String dataInptPgm;

	@CreatedDate
	@Column(name="DATA_INPT_DTTM", updatable = false)
	private LocalDateTime dataInptDttm;
	
	@LastModifiedBy
	@Column(name="DATA_UPD_ID")
	private String dataUpdId;

	@LastModifiedBy
	@Column(name="DATA_UPD_PGM")
	private String dataUpdPgm;

	@LastModifiedDate
	@Column(name="DATA_UPD_DTTM")
	private LocalDateTime dataUpdDttm;

}
