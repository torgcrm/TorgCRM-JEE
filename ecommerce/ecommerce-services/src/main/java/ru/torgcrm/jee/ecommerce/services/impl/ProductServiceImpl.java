package ru.torgcrm.jee.ecommerce.services.impl;

import ru.torgcrm.jee.ecommerce.domain.Product;
import ru.torgcrm.jee.ecommerce.dto.ProductDTO;
import ru.torgcrm.jee.ecommerce.mappers.ProductMapper;
import ru.torgcrm.jee.ecommerce.repository.ProductRepository;
import ru.torgcrm.jee.ecommerce.services.IProductService;

import javax.ejb.Stateless;
import java.util.List;

/**
 * Service for {@link ru.torgcrm.jee.ecommerce.repository.jpa.JpaProductRepository}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class ProductServiceImpl extends AbstractWebPageServiceImpl<ProductDTO, ProductRepository, ProductMapper>
        implements IProductService {
    @Override
    public List<ProductDTO> findAllByCatalogSlug(String slug) {
        List<Product> products = getRepository().findAllByCatalogSlug(slug);
        return getMapper().toDto(products);
    }
}
