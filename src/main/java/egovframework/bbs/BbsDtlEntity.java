package egovframework.bbs;

import java.math.BigDecimal;

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
import egovframework.bas.FileEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * fileName       : BbsDtlEntity
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
@Table(name="TB_BBS_D")
public class BbsDtlEntity extends BaseEntity {
	
	/* PRIMARY KEY (NTT_ID,BBS_ID) 를 대체하는 UUID */
	@Id 
	@GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "bbsDtlId", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="BBS_DTL_ID", length=32, nullable=false)
    @Comment("UUID")
	private String bbsDtlId;
	
	/* 원래의 PK1 */ 
	@Comment(value = "게시물ID")
	@Column(name="NTT_ID", precision=20, scale=0, nullable=false)
	private BigDecimal nttId; // decimal(20,0) not null,
	/* 원래의 PK2, FK */ 
	@ManyToOne
    @JoinColumn(name="BBS_ID", nullable = false)
    private BbsEntity bbsEntity;
	
	/* FK -원래는 FK 설정이 안되어 있으나, 첨부파일 테이블이 별도 존재하므로 우선 fk 매핑함, 외래키 필요없을 시 하기 주석으로 대체 */    
    @ManyToOne
    @JoinColumn(name="ATCH_FILE_ID")
    private FileEntity fileEntity;
    /*
    @Column(name="ATCH_FILE_ID", length=20)
    @Comment("첨부파일ID")
	private String atchFileId;
	*/
    

    @Comment(value = "게시물번호")
	@Column(name="NTT_NO", precision=20, scale=0)
	private BigDecimal nttNo; // decimal(20,0) default null,

    @Comment(value = "게시물제목")
	@Column(name="NTT_SJ", length=2000)
	private String nttSj; // varchar(2000) default null,

    @Comment(value = "게시물내용")
	@Column(name="NTT_CN", columnDefinition="TEXT")
	private String nttCn; // mediumtext,

    @Comment(value = "답변여부")
	@Column(name="ANSR_YN", length=1)
	private String ansrYn; // char(1) default null,

    @Comment(value = "부모글번호")
	@Column(name="PRNT_CTT_NO", precision=10, scale=0)
	private BigDecimal prntCttNo; // decimal(10,0) default null,

    @Comment(value = "답변위치")
	@Column(name="ANSR_LOC", length=11)
	private Integer ansrLoc; // int(11) default null,

    @Comment(value = "정렬순서")
	@Column(name="SORT_ORD", precision=8, scale=0)
	private BigDecimal sortOrd; // decimal(8,0) default null,

    @Comment(value = "조회수")
	@Column(name="READ_CNT", precision=20, scale=0)
	private BigDecimal readCnt; // decimal(10,0) default null,

    @Comment(value = "사용여부")
	@Column(name="USE_YN", length=1, nullable=false)
	private String useYn; // char(1) not null,

    @Comment(value = "게시시작일")
	@Column(name="NTCE_BGN_DT", length=8)
	private String ntceBgnDt; // char(20) default null,

    @Comment(value = "게시종료일")
	@Column(name="NTCE_END_DT", length=8)
	private String ntceEndDt; // char(20) default null,

    @Comment(value = "게시자ID")
	@Column(name="NTCR_ID", length=20)
	private String ntcrId; // varchar(20) default null,

    @Comment(value = "게시자명")
	@Column(name="NTCR_NM", length=20)
	private String ntcrNm; // varchar(20) default null,

    @Comment(value = "비밀번호")
	@Column(name="PWD")
	private String password; // varchar(200) default null,
	

}
