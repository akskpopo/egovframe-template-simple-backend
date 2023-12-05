package egovframework.mbr;

import lombok.*;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;
import org.springframework.lang.Nullable;

import egovframework.bas.BaseEntity;
import egovframework.bas.CmmCdEntity;

/**
 * fileName       : AuthGrpEntity
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
@Table(name="TB_USER_M")
public class UserEntity extends BaseEntity {
	
	/* ID, PK */
    @Id
    @Column(name="USER_ID", length=20, nullable=false)
    @Comment("사용자ID")
    private String userId;
    
    /* FK */
    @ManyToOne
    @JoinColumn(name="ORG_ID")
    @Comment("조직ID")
    private OrgEntity orgEntity;
    
    @ManyToOne
    @JoinColumn(name="GRP_ID")
    private AuthGrpEntity authGrpEntity;
    
    
    
    
    @Column(name="PWD", length=200, nullable=false)
    @Comment("비밀번호")
    private String pwd;
    
    @Column(name="PWD_HINT", length=100, nullable=false)
    @Comment("비밀번호힌트")
    private String pwdHint;
    
    @Column(name="PWD_CNSR", length=100, nullable=false)
    @Comment("비밀번호정답")
    private String pwdCnsr;
    
    
    
    
    /* Employment Info - 재직 정보 */
    @Column(name="EMP_NO", length=20)
    @Comment("사원번호")
    private String empNo;
    
    @Column(name="OFCPS_NM", length=60)
    @Comment("직위명")
    private String ofcpsNm;    
    
    @Column(name="PSTINST_CD", length=8)
    @Comment("소속기관코드")
    private String pstinstCd;
    
    @Column(name="EMP_STUS_CD", length=15, nullable=false)
    @Comment("사용자상태코드")
    private String empStusCd;
    
    /* 
    @Column(name="ESNTL_ID", length=20)
    @Comment("") // ??????
    private String esntlId; 
    */
    
    /*
    @Column(name="CRTFC_DN_VALUE", length=20)
    @Comment("인증") // ??????
    private String crtfcDnValue;
    */
    
    @Column(name="FXNO", length=20)
    @Comment("팩스번호")
    private String fxno;
    
    @Column(name="OFFC_TLNO", length=20)
    @Comment("사무실전화번호")
    private String offcTlno;
    
    
    
    
    /* Privacy Info - 기본 신상 */    
    @NotNull
    @Column(name="USER_NM", length=60, nullable=false)
    @Comment("사용자이름") // 자료사전에 없어 임의지칭
    private String userNm;
    
    @Column(name="IHIDNUM", length=200)
    @Comment("주민등록번호")
    private String ihidnum;
    /*
    @Column(name="SEXDSTN_CODE", length=1)
    @Comment("성별코드")
    private String sexdstnCode;
    */
    @Column(name="BRTH_DT", length=20)
    @Comment("생년월일")
    private String brthDt;
    
    @Column(name="TLNO", length=20)
    @Comment("휴대전화번호")
    private String tlno;
    
    @Column(name="EMAL_ADRS", length=50)
    @Comment("이메일주소")
    private String emalAdrs;
    
    @Column(name="HS_ADRS", length=100)
    @Comment("자택주소")
    private String hsAdrs;
    
    @Column(name="DTL_ADRS", length=100)
    @Comment("상세주소")
    private String dtlAdrs;
    
    @Column(name="ZIP", length=6)
    @Comment("우편번호")
    private String zip;

    @Column(name="AREA_NO", length=4)
    @Comment("지역번호")
    private String areaNo;
    
    @Column(name="HS_MID_TLNO", length=4)
    @Comment("집중간전화번호")
    private String hsMidTlno;

    @Column(name="HS_END_TLNO", length=4)
    @Comment("집끝전화번호")
    private String hsEndTlno;
    
    @Column(name="ENTR_DT")
    @Comment("가입일자")
    private LocalDateTime entrDt;
    

}