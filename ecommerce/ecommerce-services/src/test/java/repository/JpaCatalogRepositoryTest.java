package repository;

import org.junit.Test;
import ru.torgcrm.jee.ecommerce.domain.Catalog;
import ru.torgcrm.jee.ecommerce.repository.CatalogRepository;
import ru.torgcrm.jee.ecommerce.utils.generators.CatalogGenerator;

import javax.inject.Inject;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public class JpaCatalogRepositoryTest extends AbstractRepositoryTest<Catalog> {

    @Inject
    private CatalogRepository catalogRepository;
    @Inject
    private CatalogGenerator catalogGenerator;

    @Test
    @Override
    public void findBySlugAndProjectIdTest() {

    }

    @Test
    @Override
    public void findAllTest() {
        Catalog catalog1 = catalogGenerator.createEntity();
        Catalog catalog2 = catalogGenerator.createEntity();
        Catalog catalog3 = catalogGenerator.createEntity();
        catalogRepository.persist(catalog1);
        catalogRepository.persist(catalog2);
        catalogRepository.persist(catalog3);
        List<Catalog> catalogList = catalogRepository.findAll();
        assertFalse(catalogList.isEmpty());
        assertTrue(catalogList.size() >= 3);
    }

    @Test
    @Override
    public void findAllByProjectIdTest() {

    }

    @Test
    @Override
    public void findByIdTest() {

    }

    @Test
    @Override
    public void saveTest() {

    }

    @Test
    @Override
    public void deleteTest() {

    }
}
