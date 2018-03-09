package ru.torgcrm.jee.ecommerce.services.impl;

import ru.torgcrm.jee.ecommerce.domain.Product;
import ru.torgcrm.jee.ecommerce.dto.ProductDTO;
import ru.torgcrm.jee.ecommerce.mappers.ProductMapper;
import ru.torgcrm.jee.ecommerce.repository.ProductRepository;
import ru.torgcrm.jee.ecommerce.services.IProductService;

import javax.ejb.Stateless;

/**
 * Service for {@link ru.torgcrm.jee.ecommerce.repository.jpa.JpaProductRepository}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class ProductService
        extends GenericService<ProductDTO, ProductRepository, ProductMapper> implements IProductService {

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductDTO findBySlugAndProjectId(String slug, Long projectId) {
        Product product = getRepository().findBySlugAndProjectId(slug, projectId);
        if (product != null) {
            return getMapper().toDto(product);
        }
        return null;
    }
}
