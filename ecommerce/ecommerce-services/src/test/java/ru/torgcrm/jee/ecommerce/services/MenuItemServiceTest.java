package ru.torgcrm.jee.ecommerce.services;

import ru.torgcrm.jee.ecommerce.dto.MenuItemDTO;
import ru.torgcrm.jee.ecommerce.utils.generators.MenuItemGenerator;

import javax.inject.Inject;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public class MenuItemServiceTest extends AbstractProjectServiceTest
        <MenuItemDTO, MenuItemService, MenuItemGenerator> {

    @Inject
    MenuItemService service;
    @Inject
    MenuItemGenerator generator;

    @Override
    protected MenuItemService getService() {
        return service;
    }

    @Override
    protected MenuItemGenerator getGenerator() {
        return generator;
    }
}
