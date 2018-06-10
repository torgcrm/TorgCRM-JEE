package ru.torgcrm.jee.ecommerce.services.impl;

import ru.torgcrm.jee.ecommerce.domain.Menu;
import ru.torgcrm.jee.ecommerce.dto.MenuDTO;
import ru.torgcrm.jee.ecommerce.mappers.MenuMapper;
import ru.torgcrm.jee.ecommerce.repository.MenuRepository;
import ru.torgcrm.jee.ecommerce.services.MenuService;

import javax.ejb.Stateless;

/**
 * Service for menu
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class MenuServiceImpl extends GenericServiceImpl<MenuDTO, MenuRepository, MenuMapper>
        implements MenuService {
    /**
     * {@inheritDoc}
     */
    @Override
    public MenuDTO findByProjectIdAndCode(Long projectId, String code) {
        Menu menu = getRepository().findByProjectIdAndCode(projectId, code);
        return getMapper().toDto(menu);
    }
}
