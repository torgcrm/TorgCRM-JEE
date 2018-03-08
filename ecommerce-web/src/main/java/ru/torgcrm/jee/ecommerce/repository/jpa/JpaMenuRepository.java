package ru.torgcrm.jee.ecommerce.repository.jpa;

import ru.torgcrm.jee.ecommerce.domain.Menu;
import ru.torgcrm.jee.ecommerce.repository.MenuRepository;

import javax.enterprise.context.ApplicationScoped;

/**
 * Menu repository, see {@link Menu}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@ApplicationScoped
public class JpaMenuRepository extends JpaGenericRepository<Menu>
        implements MenuRepository {
}
