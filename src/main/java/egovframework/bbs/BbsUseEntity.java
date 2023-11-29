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
@Table(name="TB_BBS_USE_M")
public class BbsUseEntity {
	
	@Id
	@Column(name="BBS_USE_ID")
    @Comment("UUID")
	private String bbsUseId;
	
	@Column(name="BBS_ID")
    @Comment("게시판ID")
	private String bbsId; // char(20) not null,
	
	@Column(name="TRGT_ID")
    @Comment("대상ID")
	private String trgetId; // char(20) not null default '',
	
	@Column(name="USE_YN")
    @Comment("사용여부")
	private String useYn; // char(1) not null,
	
	@Column(name="REGIST_SE_CODE")
    @Comment("등록구분코드")
	private String registSeCode; // char(6) default null,
	
	
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
