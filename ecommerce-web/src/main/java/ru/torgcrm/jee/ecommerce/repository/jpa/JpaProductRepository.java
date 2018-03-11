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
public class JpaProductRepository extends JpaAbstractWebPageRepository<Product>
        implements ProductRepository {
    private final Logger log = Logger.getLogger(JpaProductRepository.class);

    /**
     * Find all products by catalog slug
     *
     * @param slug catalog slug
     * @return list of {@link Product}
     */
    @Override
    public List<Product> findAllByCatalogSlug(String slug) {
        try {
            return entityManager.createNamedQuery(Product.FIND_BY_CATALOG_SLUG)
                    .setParameter("catalogSlug", slug).getResultList();
        } catch (Exception e) {
            log.error("Something went wrong while trying to execute query: " + e.getMessage());
        }
        return null;
    }
}
