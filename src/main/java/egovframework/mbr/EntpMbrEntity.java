package egovframework.mbr;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;

import egovframework.bas.BaseEntity;
import egovframework.bas.ClCdEntity;
import egovframework.bas.CmmCdEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * fileName       : EntpMbrEntity
 * author         : hanslee
 * date           : 2023/11/27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/11/27        hanslee	최초 생성
 * 2023/11/30        hanslee	엔티티명 변경 및 BaseEntity 상속 추가 등
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
@ToString
@Table(name="TB_ENTP_MBR_M")
public class EntpMbrEntity extends BaseEntity {

	@Id
	@Column(name="ENTP_MBR_ID", length=20, nullable=false)
    @Comment("기업회원ID")
	private String entpMbrId; // varchar(20) not null default '',
	
	
	@Column(name="ENTP_MBR_PWD", length=200, nullable=false)
    @Comment("기업회원비밀번호")
	private String entpMbrPwd; // varchar(200) not null,
	
	@Column(name="ENTP_MBR_PWD_HINT", length=100, nullable=false)
    @Comment("기업회원비밀번호힌트")
	private String entpMbrPwdHint; // varchar(100) not null,
	
	@Column(name="ENTP_MBR_PWD_CNSR", length=100, nullable=false)
    @Comment("기업회원비밀번호정답")
	private String entpMbrPwdCnsr; // varchar(100) not null,
	
	
	@Column(name="ENTP_DIVS_CD", length=15)
    @Comment("기업구분코드")
	private String entpDivsCd; // char(15) default null,
	
	@Column(name="ENTP_MBR_STUS", length=15)
    @Comment("기업회원상태")
	private String entpMbrStus; // varchar(15) default null,
	
	@Column(name="BIZRNO", length=10)
    @Comment("사업자번호")
	private String bizrno; // varchar(10) default null,
	
	@Column(name="JURIRNO", length=13)
    @Comment("법인등록번호")
	private String jurirno; // varchar(13) default null,
	
	@Column(name="CMPY_NM", length=60, nullable=false)
    @Comment("회사명")
	private String cmpyNm; // varchar(60) not null,
	
	@Column(name="IDTY_CD", length=15)
    @Comment("업종코드")
	private String idtyCd; // char(15) default null,
	/*
	@Column(name="CXFC")
    @Comment("대표이사")
	private String cxfc; // varchar(50) default null,
	*/
	
	
	
	@Column(name="ZIP", length=6)
    @Comment("우편번호")
	private String zip; // varchar(6) default null,
	
	@Column(name="ADRS", length=100)
    @Comment("주소")
	private String adrs; // varchar(100) default null,
	
	@Column(name="DTL_ADRS", length=100)
    @Comment("상세주소")
	private String dtlAdrs; // varchar(100) default null,
	
	@Column(name="AREA_NO", length=4)
    @Comment("지역번호")
	private String areaNo; // varchar(4) default null,
	
	@Column(name="ENTP_MID_TLNO", length=4)
    @Comment("기업중간전화번호")
	private String entpMidTlno; // varchar(4) default null,
	
	@Column(name="ENTP_END_TLNO", length=4)
    @Comment("기업끝전화번호")
	private String entpEndTlno; // varchar(4) default null,
	
	@Column(name="FXNO", length=20)
    @Comment("팩스번호")
	private String fxno; // varchar(20) default null,
	
	
	
	@Column(name="APLCT_NM")
    @Comment("신청자명")
	private String aplctNm; // varchar(50) not null,
	/*
	@Column(name="APLCT_IHIDNUM")
    @Comment("신청자주민등록번호")
	private String applcntIhidnum; // varchar(200) default null,
	*/
	@Column(name="APLCT_EMAL_ADRS")
    @Comment("신청자이메일주소")
	private String aplctEmalAdrs; // varchar(50) default null,
	
	
	@ManyToOne
    @JoinColumn(name="GRP_ID")
    private AuthGrpEntity authGrpEntity;
	
	@Column(name="ENTR_DT")
    @Comment("가입일자")
	private LocalDateTime entrDt; // datetime default null,
	/*
	@Column(name="ESNTL_ID")
    @Comment("") // ????????
	private String esntlId; // char(20) not null,
	*/
}
