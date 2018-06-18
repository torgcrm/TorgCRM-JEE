package ru.torgcrm.jee.ecommerce.services;

import ru.torgcrm.jee.ecommerce.dto.ProductDTO;
import ru.torgcrm.jee.ecommerce.utils.generators.ProductGenerator;

import javax.inject.Inject;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public class ProductServiceTest extends AbstractWebPageServiceTest
        <ProductDTO, ProductService, ProductGenerator> {

    @Inject
    ProductService productService;
    @Inject
    ProductGenerator productGenerator;

    @Override
    protected ProductService getService() {
        return productService;
    }

    @Override
    protected ProductGenerator getGenerator() {
        return productGenerator;
    }
}
