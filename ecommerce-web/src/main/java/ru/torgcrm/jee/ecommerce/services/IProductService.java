package ru.torgcrm.jee.ecommerce.services;

import ru.torgcrm.jee.ecommerce.dto.ProductDTO;

import java.util.List;

/**
 * Service for product repository {@link ru.torgcrm.jee.ecommerce.domain.Product}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 * @see ProductDTO
 */
public interface IProductService {
    List<ProductDTO> findAll();
}
