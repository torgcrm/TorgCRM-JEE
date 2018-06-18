package ru.torgcrm.jee.ecommerce.repository;

import ru.torgcrm.jee.ecommerce.domain.AbstractWebPageEntity;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public interface AbstractWebPageRepository<T extends AbstractWebPageEntity> extends AbstractProjectRepository<T> {
    /**
     * Find entity by project and slug
     *
     * @param slug      slug
     * @param projectId project id
     * @return {@link AbstractWebPageEntity}
     */
    T findBySlugAndProjectId(String slug, Long projectId);
}
