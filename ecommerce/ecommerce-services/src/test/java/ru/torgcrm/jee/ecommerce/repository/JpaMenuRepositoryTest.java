package ru.torgcrm.jee.ecommerce.repository;

import ru.torgcrm.jee.ecommerce.domain.Menu;
import ru.torgcrm.jee.ecommerce.utils.generators.MenuGenerator;

import javax.inject.Inject;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public class JpaMenuRepositoryTest extends AbstractProjectRepositoryTest
        <Menu, MenuRepository, MenuGenerator> {

    @Inject
    private MenuRepository menuRepository;
    @Inject
    private MenuGenerator menuGenerator;

    @Override
    protected MenuRepository getRepository() {
        return menuRepository;
    }

    @Override
    protected MenuGenerator getGenerator() {
        return menuGenerator;
    }
}
