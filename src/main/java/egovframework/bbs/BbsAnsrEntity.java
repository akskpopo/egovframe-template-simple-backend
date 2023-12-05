package egovframework.bbs;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;
import org.hibernate.annotations.GenericGenerator;

import egovframework.bas.BaseEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * fileName       : BbsAnsrEntity
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
@Table(name="TB_BBS_ANSR_M")
public class BbsAnsrEntity extends BaseEntity {

	@Id
	@GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "bbsAnsrId", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="BBS_ANSR_ID", length=32, nullable=false)
    @Comment("UUID")
	private String bbsAnsrId;
	
	/* 원래의 PK, FK*/
	@ManyToOne
    @JoinColumn(name="BBS_ID", nullable = false)
    private BbsEntity bbsEntity;
	
	@Column(name="ANSR_YN", length=1, nullable=false)
    @Comment("답변여부")
	private String ansrYn; // char(1) not null default '',
	
	
	/* // 본래 테이블에는 존재하나, 우선 주석처리하여 사용하지 않음
	@Column(name="STSFDG_YN")
    @Comment("만족도조사")
	private String stsfdgYn; // char(1) not null default '',
    */
}
