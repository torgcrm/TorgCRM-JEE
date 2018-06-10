package mappers;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.torgcrm.jee.ecommerce.domain.Product;
import ru.torgcrm.jee.ecommerce.dto.ProductDTO;
import ru.torgcrm.jee.ecommerce.mappers.CatalogMapper;
import ru.torgcrm.jee.ecommerce.mappers.ProductMapper;
import ru.torgcrm.jee.ecommerce.mappers.ProjectMapper;
import ru.torgcrm.jee.ecommerce.utils.generators.ProductGenerator;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

/**
 * Product mapper test.
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@RunWith(Arquillian.class)
public class ProductMapperTest extends AbstractMapperTest {

    @Inject
    ProductMapper productMapper;
    @Inject
    CatalogMapper catalogMapper;
    @Inject
    ProjectMapper projectMapper;
    @Inject
    ProductGenerator productGenerator;

    @Test
    @Override
    public void toEntityTest() {
        Product product = productGenerator.createEntity();
        ProductDTO productDto = productMapper.toDto(product);
        assertEquals(product.getArticle(), productDto.getArticle());
        assertEquals(catalogMapper.toDto(product.getCatalog()), productDto.getCatalog());
        assertEquals(product.getDraft(), productDto.getDraft());
        assertEquals(product.getInStock(), productDto.getInStock());
        assertEquals(product.getOldPrice(), productDto.getOldPrice());
        assertEquals(product.getPrice(), productDto.getPrice());
        assertEquals(product.getShortDesc(), productDto.getShortDesc());
        assertEquals(product.getViewName(), productDto.getViewName());
        assertEquals(product.getCreated(), productDto.getCreated());
        assertEquals(product.getUpdated(), productDto.getUpdated());
        assertEquals(product.getMetaDescription(), productDto.getMetaDescription());
        assertEquals(product.getMetaKeywords(), productDto.getMetaKeywords());
        assertEquals(projectMapper.toDto(product.getProject()), productDto.getProject());
        assertEquals(product.getSeoText(), productDto.getSeoText());
        assertEquals(product.getSlug(), productDto.getSlug());
        assertEquals(product.getTitle(), productDto.getTitle());
    }

    @Test
    @Override
    public void toDtoTest() {
        ProductDTO productDto = productGenerator.createDto();
        Product product = productMapper.toEntity(productDto);
        assertEquals(product.getArticle(), productDto.getArticle());
        assertEquals(catalogMapper.toDto(product.getCatalog()), productDto.getCatalog());
        assertEquals(product.getDraft(), productDto.getDraft());
        assertEquals(product.getInStock(), productDto.getInStock());
        assertEquals(product.getOldPrice(), productDto.getOldPrice());
        assertEquals(product.getPrice(), productDto.getPrice());
        assertEquals(product.getShortDesc(), productDto.getShortDesc());
        assertEquals(product.getViewName(), productDto.getViewName());
        assertEquals(product.getCreated(), productDto.getCreated());
        assertEquals(product.getUpdated(), productDto.getUpdated());
        assertEquals(product.getMetaDescription(), productDto.getMetaDescription());
        assertEquals(product.getMetaKeywords(), productDto.getMetaKeywords());
        assertEquals(projectMapper.toDto(product.getProject()), productDto.getProject());
        assertEquals(product.getSeoText(), productDto.getSeoText());
        assertEquals(product.getSlug(), productDto.getSlug());
        assertEquals(product.getTitle(), productDto.getTitle());
    }
}
