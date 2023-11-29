package egovframework.bbs;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name="TB_BBS_MSTR_OPTN_M")
public class BbsMasterOptnEntity {

	@Id
	@Column(name="BBS_ID")
    @Comment("게시판ID")
	private String bbsId;
	
	@Column(name="ANSWER_YN")
    @Comment("답변여부")
	private String answerYn; // char(1) not null default '',
	
	@Column(name="STSFDG_YN")
    @Comment("")
	private String stsfdgYn; // char(1) not null default '',
	
	
	@Column(name="FRST_REGIST_PNTTM")
    @Comment("최초등록시점")
    private LocalDateTime frstRegistPnttm;
    
    @Column(name="FRST_REGISTER_ID", length=20)
    @Comment("최초등록자ID")
    private String frstRegisterId;
    
    @Column(name="LAST_UPDT_PNTTM")
    @Comment("최종수정시점")
    private LocalDateTime lastUpdtPnttm;
    
    @Column(name="LAST_UPDUSR_ID", length=20)
    @Comment("최종수정자ID")
    private String lastUpdUsrId; 
    
}
