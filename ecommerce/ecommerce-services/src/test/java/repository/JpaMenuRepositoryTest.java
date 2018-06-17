package repository;

import ru.torgcrm.jee.ecommerce.domain.Menu;
import ru.torgcrm.jee.ecommerce.domain.MenuItem;
import ru.torgcrm.jee.ecommerce.repository.MenuItemRepository;
import ru.torgcrm.jee.ecommerce.repository.MenuRepository;
import ru.torgcrm.jee.ecommerce.utils.generators.MenuGenerator;
import ru.torgcrm.jee.ecommerce.utils.generators.MenuItemGenerator;

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
