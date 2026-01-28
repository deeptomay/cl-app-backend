package comtax.gov.webapp.service;

import comtax.gov.webapp.repo.UserProjectRoleProjection;

public interface UserProjectService {

    UserProjectRoleProjection getRoleByHrmsAndProject(
            String hrmsCode,
            String projectId
    );
}
