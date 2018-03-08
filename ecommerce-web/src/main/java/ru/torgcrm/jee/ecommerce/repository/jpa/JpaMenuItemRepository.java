package ru.torgcrm.jee.ecommerce.repository.jpa;

import ru.torgcrm.jee.ecommerce.domain.MenuItem;
import ru.torgcrm.jee.ecommerce.repository.MenuItemRepository;

import javax.enterprise.context.ApplicationScoped;

/**
 * JPA repository for items {@link MenuItem}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@ApplicationScoped
public class JpaMenuItemRepository extends JpaGenericRepository<MenuItem>
        implements MenuItemRepository {
}
