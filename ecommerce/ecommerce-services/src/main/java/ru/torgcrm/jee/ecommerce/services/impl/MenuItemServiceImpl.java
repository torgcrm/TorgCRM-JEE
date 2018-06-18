package ru.torgcrm.jee.ecommerce.services.impl;

import ru.torgcrm.jee.ecommerce.dto.MenuItemDTO;
import ru.torgcrm.jee.ecommerce.mappers.MenuItemMapper;
import ru.torgcrm.jee.ecommerce.repository.MenuItemRepository;
import ru.torgcrm.jee.ecommerce.services.MenuItemService;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Service for menu item
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class MenuItemServiceImpl extends AbstractProjectServiceImpl<MenuItemDTO, MenuItemRepository, MenuItemMapper>
        implements MenuItemService {
    @Inject
    MenuItemRepository repository;
    @Inject
    MenuItemMapper mapper;

    @Override
    protected MenuItemRepository getRepository() {
        return repository;
    }

    @Override
    protected MenuItemMapper getMapper() {
        return mapper;
    }
}
