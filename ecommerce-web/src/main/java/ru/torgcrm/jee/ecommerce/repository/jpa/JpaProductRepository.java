package ru.torgcrm.jee.ecommerce.repository.jpa;

import ru.torgcrm.jee.ecommerce.domain.Product;
import ru.torgcrm.jee.ecommerce.repository.ProductRepository;

import javax.enterprise.context.ApplicationScoped;

/**
 * JPA repository for {@link Product}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@ApplicationScoped
public class JpaProductRepository extends JpaGenericRepository<Product>
        implements ProductRepository {
}
