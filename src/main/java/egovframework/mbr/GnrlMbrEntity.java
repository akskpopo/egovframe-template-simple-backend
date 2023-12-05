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
 * fileName       : GnrlMbrEntity
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
@Table(name="TB_GNRL_MBR_M")
public class GnrlMbrEntity extends BaseEntity {

	@Id
	@Column(name="MBR_ID", length=20, nullable=false)
    @Comment("회원ID")
	private String mbrId; // varchar(20) not null default '',

	
	@Column(name="PWD", length=20, nullable=false)
    @Comment("비밀번호")
	private String pwd; // varchar(200) not null,

	@Column(name="PWD_HINT", length=100, nullable=false)
    @Comment("비밀번호힌트")
	private String pwdHint; // varchar(100) not null,

	@Column(name="PWD_CNSR", length=100, nullable=false)
    @Comment("비밀번호정답")
	private String pwdCnsr; // varchar(100) not null,
	
	@Column(name="MBR_STUS_CD", length=15)
    @Comment("회원상태")
	private String mbrStusCd; // varchar(15) default null,
	
	
	@Column(name="MBR_NM", length=50, nullable=false)
    @Comment("회원명")
	private String mbrNm; // varchar(50) not null,
	
	/*
	@Column(name="IHIDNUM", length=20, nullable=false)
    @Comment("주민등록번호")
	private String ihidnum; // varchar(200) default null,
	*/
	
	/*
	@Column(name="SEXDSTN_CODE", length=20, nullable=false)
    @Comment("성별코드")
	private String sexdstnCode; // char(1) default null,
	*/
	
	@Column(name="MBR_EMAL_ADRES", length=20, nullable=false)
    @Comment("회원이메일주소")
	private String mbrEmalAdres; // varchar(50) default null,
	
	@Column(name="TLNO", length=20, nullable=false)
    @Comment("휴대전화번호")
	private String tlno; // varchar(20) default null,
	
	@Column(name="ZIP", length=6)
    @Comment("우편번호")
	private String zip; // varchar(6) default null,
	
	@Column(name="ADRES", length=100)
    @Comment("주소")
	private String adres; // varchar(100) default null,
	
	@Column(name="DTL_ADRES", length=100)
    @Comment("상세주소")
	private String dtlAdres; // varchar(100) default null,
	
	@Column(name="AREA_NO", length=4)
    @Comment("지역번호")
	private String areaNo; // varchar(4) default null,
	
	@Column(name="MID_TLNO", length=4)
    @Comment("중간전화번호")
	private String midTlno; // varchar(4) default null,
	
	@Column(name="END_TLNO", length=4)
    @Comment("끝전화번호")
	private String endTlno; // varchar(4) default null,

	@Column(name="MBR_FXNO", length=20)
    @Comment("회원팩스번호")
	private String mbrFxno; // varchar(20) default null,
	

	@Column(name="ENTR_DT")
    @Comment("가입일자")
	private LocalDateTime entrDt; // datetime default null,
	
	
	
	
	@ManyToOne
    @JoinColumn(name="GRP_ID")
    private AuthGrpEntity authGrpEntity;
	
	/*
	@Column(name="ESNTL_ID")
    @Comment("") // ???
	private String esntlId; // char(20) not null,
	*/
}
