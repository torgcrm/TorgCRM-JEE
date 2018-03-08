package ru.torgcrm.jee.ecommerce.services;

import ru.torgcrm.jee.ecommerce.domain.Product;
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
        List<Product> productDtos = productRepository.findAll();
        if (productDtos != null) {
            return productMapper.toDto(productDtos);
        }
        return null;
    }

    @Override
    public ProductDTO findById(Long id) {
        Product product = productRepository.findById(id);
        if (product != null) {
            return productMapper.toDto(product);
        }
        return null;
    }

    @Override
    public List<ProductDTO> findAllByProject(Long projectId) {
        List<Product> products = productRepository.findAllByProject(projectId);
        if (products != null) {
            return productMapper.toDto(products);
        }
        return null;
    }
}
