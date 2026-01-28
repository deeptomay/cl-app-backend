package comtax.gov.webapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "impact2_role_master")
public class Impact2RoleMaster {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long role_id; // surrogate key (recommended)
	 
	 @Column(name = "role_name", nullable = false)
	    private String role_name;



}
