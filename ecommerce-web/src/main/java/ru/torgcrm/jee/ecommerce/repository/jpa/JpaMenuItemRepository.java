package ru.torgcrm.jee.ecommerce.repository.jpa;

import ru.torgcrm.jee.ecommerce.domain.MenuItem;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@ApplicationScoped
public class JpaMenuItemRepository extends JpaGenericRepository<MenuItem> {
}
