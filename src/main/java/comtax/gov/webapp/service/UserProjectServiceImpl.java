package comtax.gov.webapp.service;

import org.springframework.stereotype.Service;

import comtax.gov.webapp.repo.Impact2UserProjectDetRepository;
import comtax.gov.webapp.repo.UserProjectRoleProjection;

@Service
public class UserProjectServiceImpl implements UserProjectService {

    private final Impact2UserProjectDetRepository repository;

    public UserProjectServiceImpl(Impact2UserProjectDetRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserProjectRoleProjection getRoleByHrmsAndProject(
            String hrmsCode,
            String projectId) {

        return repository.findRoleByHrmsAndProject(hrmsCode, projectId)
                .orElseThrow(() ->
                        new RuntimeException("No role found for given HRMS and Project"));
    }
}
