package mappers;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.torgcrm.jee.ecommerce.domain.Catalog;
import ru.torgcrm.jee.ecommerce.dto.CatalogDTO;
import ru.torgcrm.jee.ecommerce.mappers.CatalogMapper;
import ru.torgcrm.jee.ecommerce.mappers.ProjectMapper;
import ru.torgcrm.jee.ecommerce.utils.generators.CatalogGenerator;

import javax.inject.Inject;

import static org.junit.Assert.*;

/**
 * Mapper test, testing mapstruct mapper.
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@RunWith(Arquillian.class)
public class CatalogMapperTest extends AbstractMapperTest {

    @Inject
    CatalogMapper catalogMapper;
    @Inject
    CatalogGenerator catalogGenerator;
    @Inject
    ProjectMapper projectMapper;

    @Test
    public void toDtoTest() {
        Catalog catalogEntity = catalogGenerator.createEntity();
        CatalogDTO catalogDto = catalogMapper.toDto(catalogEntity);
        assertEquals(catalogEntity.getCreated(), catalogDto.getCreated());
        assertEquals(catalogEntity.getUpdated(), catalogDto.getUpdated());
        assertEquals(catalogEntity.getMetaDescription(), catalogDto.getMetaDescription());
        assertEquals(catalogEntity.getMetaKeywords(), catalogDto.getMetaKeywords());
        assertEquals(projectMapper.toDto(catalogEntity.getProject()), catalogDto.getProject());
        assertEquals(catalogEntity.getSeoText(), catalogDto.getSeoText());
        assertEquals(catalogEntity.getSlug(), catalogDto.getSlug());
        assertEquals(catalogEntity.getTitle(), catalogDto.getTitle());
    }

    @Test
    public void toEntityTest() {
        CatalogDTO catalogDto = catalogGenerator.createDto();
        Catalog catalogEntity = catalogMapper.toEntity(catalogDto);
        assertEquals(catalogEntity.getCreated(), catalogDto.getCreated());
        assertEquals(catalogEntity.getUpdated(), catalogDto.getUpdated());
        assertEquals(catalogEntity.getMetaDescription(), catalogDto.getMetaDescription());
        assertEquals(catalogEntity.getMetaKeywords(), catalogDto.getMetaKeywords());
        assertEquals(catalogEntity.getProject(), projectMapper.toEntity(catalogDto.getProject()));
        assertEquals(catalogEntity.getSeoText(), catalogDto.getSeoText());
        assertEquals(catalogEntity.getSlug(), catalogDto.getSlug());
        assertEquals(catalogEntity.getTitle(), catalogDto.getTitle());
    }
}
