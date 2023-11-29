package egovframework.bbs;

import java.math.BigDecimal;
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
@Table(name="TB_BBS_M")
public class BbsMasterEntity {
	
	@Id
	@Column(name="BBS_ID")
    @Comment("게시판ID")
	private String bbsId; // char(20) not null, 
	
	@Column(name="BBS_NM")
    @Comment("게시판명")
	private String bbsNm; // varchar(255) not null,
	
	@Column(name="BBS_INTRCN")
    @Comment("게시판소개")
	private String bbsIntrcn; // varchar(2400) default null,
	
	@Column(name="BBS_TY_CODE")
    @Comment("게시판유형코드")
	private String bbsTyCode; // char(6) not null,
	
	@Column(name="BBS_ATTRB_CODE")
    @Comment("게시판속성코드")
	private String bbsAttrbCode; // char(6) not null,
	
	@Column(name="REPLY_POSBL_YN")
    @Comment("답변가능여부")
	private String replyPosblAt; // char(1) default null,
	
	@Column(name="FILE_ATCH_POSBL_YN")
    @Comment("파일첨부가능여부")
	private String fileAtchPosblYn; // char(1) not null,
	
	@Column(name="ATCH_POSBL_FILE_NUM")
    @Comment("파일첨부가능개수")
	private BigDecimal atchPosblFileNumber; // decimal(2,0) not null,
	
	@Column(name="ATCH_POSBL_FILE_SIZE")
    @Comment("파일첨부가능용량")
	private BigDecimal atchPosblFileSize; // decimal(8,0) default null,
	
	@Column(name="USE_YN")
    @Comment("사용여부")
	private String useYn; // char(1) not null,
	
	@Column(name="TMPLAT_ID")
    @Comment("템플릿ID")
	private String tmplatId; // char(20) default null,
	
	
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
