package mappers;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.torgcrm.jee.ecommerce.domain.Page;
import ru.torgcrm.jee.ecommerce.dto.PageDTO;
import ru.torgcrm.jee.ecommerce.mappers.PageMapper;
import ru.torgcrm.jee.ecommerce.mappers.ProjectMapper;
import ru.torgcrm.jee.ecommerce.utils.generators.PageGenerator;
import ru.torgcrm.jee.ecommerce.utils.generators.ProjectGenerator;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

/**
 * Mapper test, testing mapstruct mapper.
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@RunWith(Arquillian.class)
public class PageMapperTest extends AbstractMapperTest {

    @Inject
    PageMapper pageMapper;
    @Inject
    ProjectMapper projectMapper;
    @Inject
    ProjectGenerator projectGenerator;
    @Inject
    PageGenerator pageGenerator;

    @Test
    public void toEntityTest() {
        Page pageEntity = pageGenerator.createEntity();
        PageDTO pageDto = pageMapper.toDto(pageEntity);
        assertEquals(pageEntity.getId(), pageDto.getId());
        assertEquals(pageEntity.getCreated(), pageDto.getCreated());
        assertEquals(pageEntity.getUpdated(), pageDto.getUpdated());
        assertEquals(pageEntity.getMetaDescription(), pageDto.getMetaDescription());
        assertEquals(pageEntity.getMetaKeywords(), pageDto.getMetaKeywords());
        assertEquals(pageEntity.getSeoText(), pageDto.getSeoText());
        assertEquals(pageEntity.getSlug(), pageDto.getSlug());
        assertEquals(pageEntity.getTitle(), pageDto.getTitle());
        assertEquals(projectMapper.toDto(pageEntity.getProject()), pageDto.getProject());
    }

    @Test
    public void toDtoTest() {
        PageDTO pageDto = pageGenerator.createDto();
        Page pageEntity = pageMapper.toEntity(pageDto);
        assertEquals(pageDto.getId(), pageEntity.getId());
        assertEquals(pageDto.getCreated(), pageEntity.getCreated());
        assertEquals(pageDto.getUpdated(), pageEntity.getUpdated());
        assertEquals(pageDto.getMetaDescription(), pageEntity.getMetaDescription());
        assertEquals(pageDto.getMetaKeywords(), pageEntity.getMetaKeywords());
        assertEquals(pageDto.getSeoText(), pageEntity.getSeoText());
        assertEquals(pageDto.getSlug(), pageEntity.getSlug());
        assertEquals(pageDto.getTitle(), pageEntity.getTitle());
        assertEquals(projectMapper.toEntity(pageDto.getProject()), pageEntity.getProject());
    }
}
