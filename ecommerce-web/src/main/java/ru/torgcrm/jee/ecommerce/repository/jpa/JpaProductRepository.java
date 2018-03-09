package ru.torgcrm.jee.ecommerce.repository.jpa;

import org.apache.log4j.Logger;
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
    private final Logger log = Logger.getLogger(JpaProductRepository.class);

    /**
     * Select product by product slug
     *
     * @param slug slug
     * @return {@link Product}
     */
    @Override
    public Product findBySlugAndProjectId(String slug, Long projectId) {
        try {
            return entityManager.createNamedQuery(Product.FIND_BY_SLUG_AND_PROJECT, Product.class)
                    .setParameter("slug", slug)
                    .setParameter("projectId", projectId)
                    .getSingleResult();
        } catch (Exception e) {
            log.error("Something went wrong while trying to execute query: " + e.getMessage());
        }
        return null;
    }
}
