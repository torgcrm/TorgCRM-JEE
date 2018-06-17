package repository;

import ru.torgcrm.jee.ecommerce.domain.Catalog;
import ru.torgcrm.jee.ecommerce.repository.CatalogRepository;
import ru.torgcrm.jee.ecommerce.utils.generators.CatalogGenerator;

import javax.inject.Inject;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public class JpaCatalogRepositoryTest extends AbstractWebPageRepositoryTest
        <Catalog, CatalogRepository, CatalogGenerator> {

    @Inject
    private CatalogRepository repository;
    @Inject
    private CatalogGenerator generator;

    @Override
    protected CatalogRepository getRepository() {
        return repository;
    }

    @Override
    protected CatalogGenerator getGenerator() {
        return generator;
    }
}
