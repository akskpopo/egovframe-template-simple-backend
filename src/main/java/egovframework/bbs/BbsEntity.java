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
@Table(name="TB_BBS_D")
public class BbsEntity {

	@Id
    @Comment(value = "UUID")
	@Column(name="BBS_DTL_ID")
	private String bbsDtlId;

    @Comment(value = "게시물ID")
	@Column(name="NTT_ID")
	private String nttId; // decimal(20,0) not null,

    @Comment(value = "게시판ID")
	@Column(name="BBS_ID")
	private String bbsId; // char(20) not null,

    @Comment(value = "게시물번호")
	@Column(name="NTT_NO")
	private BigDecimal nttNo; // decimal(20,0) default null,

    @Comment(value = "게시물제목")
	@Column(name="NTT_SJ")
	private String nttSj; // varchar(2000) default null,

    @Comment(value = "게시물내용")
	@Column(name="NTT_CN")
	private String nttCn; // mediumtext,

    @Comment(value = "답변여부")
	@Column(name="ANSWER_YN")
	private String answerYn; // char(1) default null,

    @Comment(value = "부모글번호")
	@Column(name="PARNTSCTT_NO")
	private BigDecimal parntscttNo; // decimal(10,0) default null,

    @Comment(value = "답변위치")
	@Column(name="ANSWER_LC")
	private Integer answerLc; // int(11) default null,

    @Comment(value = "정렬순서")
	@Column(name="SORT_ORDR")
	private BigDecimal sortOrdr; // decimal(8,0) default null,

    @Comment(value = "")
	@Column(name="RDCNT")
	private BigDecimal rdcnt; // decimal(10,0) default null,

    @Comment(value = "사용여부")
	@Column(name="USE_YN")
	private String useYn; // char(1) not null,

    @Comment(value = "게시시작일")
	@Column(name="NTCE_BGNDE")
	private String ntceBgnde; // char(20) default null,

    @Comment(value = "게시종료일")
	@Column(name="NTCE_ENDDE")
	private String ntceEndde; // char(20) default null,

    @Comment(value = "게시자ID")
	@Column(name="NTCR_ID")
	private String ntcrId; // varchar(20) default null,

    @Comment(value = "게시자명")
	@Column(name="NTCR_NM")
	private String ntcrNm; // varchar(20) default null,

    @Comment(value = "비밀번호")
	@Column(name="PASSWORD")
	private String password; // varchar(200) default null,
	

    @Comment(value = "첨부파일ID")
	@Column(name="ATCH_FILE_ID")
	private String atchFileId; // char(20) default null,
	

    @Comment(value = "최초등록시점")
	@Column(name="FRST_REGIST_PNTTM")
    private LocalDateTime frstRegistPnttm;

    @Comment(value = "최초등록자ID")
    @Column(name="FRST_REGISTER_ID", length=20)
    private String frstRegisterId;

    @Comment(value = "최종수정시점")
    @Column(name="LAST_UPDT_PNTTM")
    private LocalDateTime lastUpdtPnttm;

    @Comment(value = "최종수정자ID")
    @Column(name="LAST_UPDUSR_ID", length=20)
    private String lastUpdUsrId; 
}
