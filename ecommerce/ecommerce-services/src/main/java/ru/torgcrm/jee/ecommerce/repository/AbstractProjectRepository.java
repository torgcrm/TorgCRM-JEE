package ru.torgcrm.jee.ecommerce.repository;

import ru.torgcrm.jee.ecommerce.domain.AbstractProjectEntity;

import java.util.List;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public interface AbstractProjectRepository<T extends AbstractProjectEntity> extends GenericRepository<T> {
    /**
     * Find all entities in database by project id
     *
     * @return List of entities
     */
    List<T> findAllByProjectId(Long projectId);
}
