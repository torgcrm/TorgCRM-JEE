package ru.torgcrm.jee.ecommerce.repository.jpa;

import ru.torgcrm.jee.ecommerce.domain.Project;
import ru.torgcrm.jee.ecommerce.repository.ProjectRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

/**
 * Project repository
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@ApplicationScoped
public class JpaProjectRepository extends JpaGenericRepository<Project>
        implements ProjectRepository {
    @Override
    public List<Project> findByHost(String host) {
        return entityManager.createNamedQuery(Project.FIND_PROJECT_BY_HOST)
                .setParameter("host", host)
                .getResultList();
    }
}
