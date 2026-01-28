package comtax.gov.webapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "impact2_user_posting_det")
public class UserAssignPostingDet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hrms_code", nullable = false)
    private String hrmsCode;

    @Column(name = "posting_type")
    private String postingType;

    @Column(name = "office_id")
    private Long officeId;

    // getters and setters
}
