package comtax.gov.webapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import comtax.gov.webapp.entity.Impact2UserProjectDet;

import java.util.Optional;

public interface Impact2UserProjectDetRepository extends JpaRepository<Impact2UserProjectDet, Long> {

	@Query("""
			    SELECT u.hrmsCode AS hrmsCode,
			           u.projectId AS projectId,
			           u.roleId AS roleId
			    FROM Impact2UserProjectDet u
			    WHERE u.hrmsCode = :hrmsCode
			      AND u.projectId = :projectId
			      AND u.status = 'L'
			""")
	Optional<UserProjectRoleProjection> findRoleByHrmsAndProject(@Param("hrmsCode") String hrmsCode,
			@Param("projectId") String projectId);
}
