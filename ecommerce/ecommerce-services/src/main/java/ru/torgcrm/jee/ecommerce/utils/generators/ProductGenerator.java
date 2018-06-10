package ru.torgcrm.jee.ecommerce.utils.generators;

import ru.torgcrm.jee.ecommerce.domain.Product;
import ru.torgcrm.jee.ecommerce.dto.ProductDTO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class ProductGenerator extends AbstractGenerator<Product, ProductDTO> {

    @Inject
    CatalogGenerator catalogGenerator;
    @Inject
    ProjectGenerator projectGenerator;

    @Override
    public Product createEntity() {
        Product product = new Product();
        product.setArticle(dataFactory.getRandomText(300));
        product.setDraft(false);
        product.setCatalog(catalogGenerator.createEntity());
        product.setInStock(true);
        product.setOldPrice(Double.valueOf(dataFactory.getNumberBetween(500, 1000)));
        product.setPrice(Double.valueOf(dataFactory.getNumberBetween(10, 300)));
        product.setShortDesc(dataFactory.getNumberText(150));
        product.setViewName(dataFactory.getRandomWord());
        product.setCreated(dataFactory.getDate(2018, 1, 2));
        product.setUpdated(dataFactory.getDate(2018, 1, 2));
        product.setMetaDescription(dataFactory.getRandomText(100));
        product.setMetaKeywords(dataFactory.getRandomText(100));
        product.setSeoText(dataFactory.getRandomText(100));
        product.setSlug(dataFactory.getRandomWord());
        product.setTitle(dataFactory.getRandomWord());
        product.setProject(projectGenerator.createEntity());
        return product;
    }

    @Override
    public ProductDTO createDto() {
        ProductDTO productDto = new ProductDTO();
        productDto.setArticle(dataFactory.getRandomText(300));
        productDto.setDraft(false);
        productDto.setCatalog(catalogGenerator.createDto());
        productDto.setInStock(true);
        productDto.setOldPrice(Double.valueOf(dataFactory.getNumberBetween(500, 1000)));
        productDto.setPrice(Double.valueOf(dataFactory.getNumberBetween(10, 300)));
        productDto.setShortDesc(dataFactory.getNumberText(150));
        productDto.setViewName(dataFactory.getRandomWord());
        productDto.setCreated(dataFactory.getDate(2018, 1, 2));
        productDto.setUpdated(dataFactory.getDate(2018, 1, 2));
        productDto.setMetaDescription(dataFactory.getRandomText(100));
        productDto.setMetaKeywords(dataFactory.getRandomText(100));
        productDto.setSeoText(dataFactory.getRandomText(100));
        productDto.setSlug(dataFactory.getRandomWord());
        productDto.setTitle(dataFactory.getRandomWord());
        productDto.setProject(projectGenerator.createDto());
        return productDto;
    }

    @Override
    public List<Product> createListEntity(int quantity) {
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            productList.add(createEntity());
        }
        return productList;
    }

    @Override
    public List<ProductDTO> createListDto(int quantity) {
        List<ProductDTO> productDtoList = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            productDtoList.add(createDto());
        }
        return productDtoList;
    }
}
