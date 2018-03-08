package ru.torgcrm.jee.ecommerce.repository;

import ru.torgcrm.jee.ecommerce.domain.Product;

import java.util.List;

/**
 * Product repository
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public interface ProductRepository extends GenericRepository<Product> {
    List<Product> findAllByProject(Long projectId);
}
