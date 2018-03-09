package ru.torgcrm.jee.ecommerce.services;

import ru.torgcrm.jee.ecommerce.dto.ProductDTO;

/**
 * Service for product repository {@link ru.torgcrm.jee.ecommerce.domain.Product}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 * @see ProductDTO
 */
public interface IProductService extends IGenericService<ProductDTO> {
    /**
     * Find product {@link ru.torgcrm.jee.ecommerce.domain.Product} by slug
     *
     * @param slug slug
     * @return {@link ProductDTO}
     */
    ProductDTO findBySlugAndProjectId(String slug, Long projectId);
}
