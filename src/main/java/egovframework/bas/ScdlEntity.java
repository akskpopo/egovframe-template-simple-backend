package egovframework.bas;

import lombok.*;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Comment;

/**
 * fileName       : ScdlEntity
 * author         : hanslee
 * date           : 2023/11/27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/11/27        hanslee 	최초 생성
 * 2023/11/30        hanslee	엔티티명 변경 및 BaseEntity 상속 추가 등
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
@ToString
@Table(name="TB_SCDL_M")
public class ScdlEntity extends BaseEntity {
	
    @Id
    @Column(name="SCDL_ID", length=20, nullable=false)
    @Comment("일정ID")
    private String scdlId;
    
    /* FK */    
    @ManyToOne
    @JoinColumn(name="ATCH_FILE_ID")
    private FileEntity fileEntity;
    
    
    @NotNull
    @Column(name="SCDL_SE", length=1)
    @Comment("일정구분")
    private String scdlSe;
    
    @Column(name="SCDL_DEPT_ID", length=20)
    @Comment("일정부서ID")
    private String scdlDeptId;
    
    @Column(name="SCDL_KND_CD", length=20)
    @Comment("일정종류코드")
    private String scdlKndCd;
    
    @Column(name="SCDL_BGN_DT")
    @Comment("일정시작일자")
    private LocalDateTime scdlBgnDt;
    
    @Column(name="SCDL_END_DT")
    @Comment("일정종료일자")
    private LocalDateTime scdlEndDt;
    
    @Column(name="SCDL_NM", length=255)
    @Comment("일정명")
    private String scdlNm;
    
    @Column(name="SCDL_CN", length=2500)
    @Comment("일정종류내용")
    private String scdlCn;
    
    @Column(name="SCDL_PLC", length=255)
    @Comment("일정장소")
    private String scdlPlc;
    
    @Column(name="SCDL_IPCR_CD", length=1)
    @Comment("일정중요도코드")
    private String scdlIpcrCd;
    
    @Column(name="SCDL_CHGR_ID", length=20)
    @Comment("일정담당자ID")
    private String scdlChgrId;
    
    @Column(name="REPT_DIVS_CD", length=3)
    @Comment("반복구분코드")
    private String reptDivsCd;
    
}