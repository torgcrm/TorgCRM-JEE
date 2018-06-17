package repository;

import ru.torgcrm.jee.ecommerce.domain.Product;
import ru.torgcrm.jee.ecommerce.repository.ProductRepository;
import ru.torgcrm.jee.ecommerce.utils.generators.ProductGenerator;

import javax.inject.Inject;

/**
 * Product repository test.
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public class JpaProductRepositoryTest extends AbstractWebPageRepositoryTest<
        Product, ProductRepository, ProductGenerator> {

    @Inject
    ProductRepository productRepository;
    @Inject
    ProductGenerator productGenerator;

    @Override
    protected ProductRepository getRepository() {
        return productRepository;
    }

    @Override
    protected ProductGenerator getGenerator() {
        return productGenerator;
    }
}
