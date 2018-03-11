package ru.torgcrm.jee.ecommerce.services;

import ru.torgcrm.jee.ecommerce.dto.MenuDTO;

/**
 * Service for menu
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public interface IMenuService extends IGenericService<MenuDTO> {
    /**
     * Find by project and code
     *
     * @param projectId project id
     * @param code      menu code
     * @return {@link MenuDTO}
     */
    MenuDTO findByProjectIdAndCode(Long projectId, String code);
}
