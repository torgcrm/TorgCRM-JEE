package ru.torgcrm.jee.ecommerce.repository;

import ru.torgcrm.jee.ecommerce.domain.AbstractWebPage;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public interface AbstractWebPageRepository<T extends AbstractWebPage> extends GenericRepository<T> {
    /**
     * Find entity by project and slug
     *
     * @param slug      slug
     * @param projectId project id
     * @return {@link AbstractWebPage}
     */
    T findBySlugAndProjectId(String slug, Long projectId);
}
