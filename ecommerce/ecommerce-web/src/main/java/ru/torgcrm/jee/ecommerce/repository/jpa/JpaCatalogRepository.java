package ru.torgcrm.jee.ecommerce.repository.jpa;

import ru.torgcrm.jee.ecommerce.domain.Catalog;
import ru.torgcrm.jee.ecommerce.repository.CatalogRepository;

import javax.enterprise.context.ApplicationScoped;

/**
 * Jpa repository for catalog entity
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@ApplicationScoped
public class JpaCatalogRepository extends JpaGenericRepository<Catalog>
        implements CatalogRepository {
}
