package ru.torgcrm.jee.ecommerce.services;

import ru.torgcrm.jee.ecommerce.dto.ProductDTO;
import ru.torgcrm.jee.ecommerce.mappers.ProductMapper;
import ru.torgcrm.jee.ecommerce.repository.ProductRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * Service for {@link ru.torgcrm.jee.ecommerce.repository.jpa.JpaProductRepository}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class ProductService implements IProductService {

    @Inject
    private ProductRepository productRepository;
    @Inject
    private ProductMapper productMapper;

    @Override
    public List<ProductDTO> findAll() {
        return productMapper.toDto(productRepository.findAll());
    }

    @Override
    public ProductDTO findById(Long id) {
        return productMapper.toDto(productRepository.findById(id));
    }
}
