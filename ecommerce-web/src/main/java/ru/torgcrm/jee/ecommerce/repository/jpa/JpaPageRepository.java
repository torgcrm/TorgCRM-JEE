package ru.torgcrm.jee.ecommerce.repository.jpa;

import ru.torgcrm.jee.ecommerce.domain.Page;
import ru.torgcrm.jee.ecommerce.repository.PageRepository;

import javax.enterprise.context.ApplicationScoped;

/**
 * Page repository {@link Page}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@ApplicationScoped
public class JpaPageRepository extends JpaGenericRepository<Page>
        implements PageRepository {
}
