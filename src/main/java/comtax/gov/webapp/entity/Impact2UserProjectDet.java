package comtax.gov.webapp.entity;



import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "impact2_user_project_det")
public class Impact2UserProjectDet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // surrogate key (recommended)

    @Column(name = "hrms_code", nullable = false)
    private String hrmsCode;

    @Column(name = "project_id", nullable = false)
    private Long projectId;

    @Column(name = "role_id")
    private String roleId;

    @Column(name = "status")
    private String status;

    @Column(name = "active_dt")
    private LocalDate activeDt;

    @Column(name = "inactive_dt")
    private LocalDate inactiveDt;

    @Column(name = "log_dt")
    private LocalDateTime logDt;

    // getters & setters
}
