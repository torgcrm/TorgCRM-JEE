package ru.torgcrm.jee.ecommerce.repository;

import ru.torgcrm.jee.ecommerce.domain.MenuItem;
import ru.torgcrm.jee.ecommerce.utils.generators.MenuItemGenerator;

import javax.inject.Inject;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public class JpaMenuItemRepositoryTest extends AbstractProjectRepositoryTest
        <MenuItem, MenuItemRepository, MenuItemGenerator> {

    @Inject
    private MenuItemRepository menuItemRepository;
    @Inject
    private MenuItemGenerator menuItemGenerator;

    @Override
    protected MenuItemRepository getRepository() {
        return menuItemRepository;
    }

    @Override
    protected MenuItemGenerator getGenerator() {
        return menuItemGenerator;
    }
}
