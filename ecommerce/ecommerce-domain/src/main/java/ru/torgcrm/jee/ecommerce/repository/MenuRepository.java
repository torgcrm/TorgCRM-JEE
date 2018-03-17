package ru.torgcrm.jee.ecommerce.repository;

import ru.torgcrm.jee.ecommerce.domain.Menu;

/**
 * Menu repository
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public interface MenuRepository extends GenericRepository<Menu> {
    /**
     * Find by project and code
     *
     * @param projectId project id
     * @param code      menu code
     * @return {@link Menu}
     */
    Menu findByProjectIdAndCode(Long projectId, String code);
}
