package ru.torgcrm.jee.ecommerce.services;

import ru.torgcrm.jee.ecommerce.dto.MenuDTO;
import ru.torgcrm.jee.ecommerce.utils.generators.MenuGenerator;

import javax.inject.Inject;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public class MenuServiceTest extends AbstractProjectServiceTest
        <MenuDTO, MenuService, MenuGenerator> {

    @Inject
    MenuService service;
    @Inject
    MenuGenerator generator;

    @Override
    protected MenuService getService() {
        return service;
    }

    @Override
    protected MenuGenerator getGenerator() {
        return generator;
    }
}
