package repository;

import lombok.extern.log4j.Log4j;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.torgcrm.jee.ecommerce.domain.Product;
import ru.torgcrm.jee.ecommerce.domain.Project;
import ru.torgcrm.jee.ecommerce.repository.ProductRepository;
import ru.torgcrm.jee.ecommerce.repository.ProjectRepository;
import ru.torgcrm.jee.ecommerce.utils.generators.ProductGenerator;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Product repository test.
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public class JpaProductRepositoryTest extends AbstractRepositoryTest<Product> {

    @Inject
    ProductGenerator productGenerator;
    @Inject
    ProductRepository productRepository;
    @Inject
    ProjectRepository projectRepository;

    @Test
    @Override
    public void findBySlugAndProjectIdTest() {
        Product product = productGenerator.createEntity();
        Product saved = productRepository.persist(product);

        Product productFromDb = productRepository
                .findBySlugAndProjectId(product.getSlug(),
                        product.getProject().getId());

        assertNotNull(productFromDb);
        assertTrue(saved.equals(productFromDb));
    }

    @Test
    @Override
    public void findAllTest() {
        productRepository.persist(productGenerator.createEntity());
        productRepository.persist(productGenerator.createEntity());
        productRepository.persist(productGenerator.createEntity());

        List<Product> products = productRepository.findAll();
        assertFalse(products.isEmpty());
        assertTrue(products.size() >= 3);
    }

    @Test
    @Override
    @Transactional
    public void findAllByProjectIdTest() {
        Product product1 = productGenerator.createEntity();
        Product product2 = productGenerator.createEntity();
        Product product3 = productGenerator.createEntity();

        productRepository.persist(product1);

        Project project = projectRepository.getReference(product1.getProject().getId());

        product2.setProject(project);
        product3.setProject(project);

        productRepository.merge(product2);
        productRepository.merge(product3);

        List<Product> productsFromDb = productRepository
                .findAllByProjectId(product1.getProject().getId());

        assertFalse(productsFromDb.isEmpty());
        assertTrue(productsFromDb.size() == 3);
    }

    @Test
    @Override
    public void findByIdTest() {
        Product product1 = productGenerator.createEntity();
        productRepository.persist(product1);

        Product fromDb = productRepository.findById(product1.getId());
        assertNotNull(fromDb);
    }

    @Test
    @Override
    public void saveTest() {
        Product product1 = productGenerator.createEntity();
        productRepository.persist(product1);

        Product fromDb = productRepository.findById(product1.getId());
        assertNotNull(fromDb);
    }

    @Test
    @Override
    public void deleteTest() {
        Product product1 = productGenerator.createEntity();
        productRepository.persist(product1);

        productRepository.delete(product1.getId());

        Product fromDb = productRepository.findById(product1.getId());
        assertNull(fromDb);
    }
}
