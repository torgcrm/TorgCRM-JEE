package ru.torgcrm.jee.ecommerce.repository;

import ru.torgcrm.jee.ecommerce.domain.Project;

import java.util.List;

/**
 * Project repository
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public interface ProjectRepository extends GenericRepository<Project> {
    List<Project> findByHost(String host);
}
