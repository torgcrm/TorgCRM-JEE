package ru.torgcrm.jee.ecommerce.services;

import ru.torgcrm.jee.ecommerce.dto.AbstractWebPageDTO;
import ru.torgcrm.jee.ecommerce.dto.GenericDTO;
import ru.torgcrm.jee.ecommerce.dto.MenuDTO;

/**
 * Webpage interface for entities with slug
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public interface AbstractWebPageService<T extends AbstractWebPageDTO> extends AbstractProjectService<T> {
    /**
     * Find by project and slug
     *
     * @param projectId project id
     * @param slug      slug
     * @return {@link MenuDTO}
     */
    T findBySlugAndProjectId(String slug, Long projectId);
}
