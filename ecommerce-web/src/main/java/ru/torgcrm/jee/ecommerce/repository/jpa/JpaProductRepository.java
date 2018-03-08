package ru.torgcrm.jee.ecommerce.repository.jpa;

import org.apache.log4j.Logger;
import ru.torgcrm.jee.ecommerce.domain.Product;
import ru.torgcrm.jee.ecommerce.repository.ProductRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

/**
 * JPA repository for {@link Product}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@ApplicationScoped
public class JpaProductRepository extends JpaGenericRepository<Product>
        implements ProductRepository {
    private final Logger log = Logger.getLogger(JpaProductRepository.class);

    /**
     * Select product by project id {@link ru.torgcrm.jee.ecommerce.domain.Project}
     *
     * @param projectId project id
     * @return list of products
     */
    @Override
    public List<Product> findAllByProject(Long projectId) {
        try {
            return entityManager.createNamedQuery(Product.FIND_BY_PROJECT)
                    .setParameter("projectId", projectId)
                    .getResultList();
        } catch (Exception e) {
            log.error("Something went wrong while trying to execute query: " + e.getMessage());
        }
        return null;
    }
}
