package ru.torgcrm.jee.ecommerce.mappers;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.torgcrm.jee.ecommerce.domain.Menu;
import ru.torgcrm.jee.ecommerce.dto.MenuDTO;
import ru.torgcrm.jee.ecommerce.utils.generators.MenuGenerator;

import javax.inject.Inject;

import static org.junit.Assert.*;

/**
 * Menu mapper test.
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@RunWith(Arquillian.class)
public class MenuMapperTest extends AbstractMapperTest {

    @Inject
    MenuGenerator menuGenerator;
    @Inject
    MenuMapper menuMapper;
    @Inject
    ProjectMapper projectMapper;

    @Test
    @Override
    public void toEntityTest() {
        Menu menu = menuGenerator.createEntity();
        MenuDTO menuDto = menuMapper.toDto(menu);
        assertEquals(menu.getCode(), menuDto.getCode());
        assertEquals(menu.getName(), menuDto.getName());
        assertEquals(menu.getCreated(), menuDto.getCreated());
        assertEquals(menu.getUpdated(), menuDto.getUpdated());
        assertEquals(projectMapper.toDto(menu.getProject()), menuDto.getProject());
    }

    @Test
    @Override
    public void toDtoTest() {
        MenuDTO menuDto = menuGenerator.createDto();
        Menu menu = menuMapper.toEntity(menuDto);
        assertEquals(menu.getCode(), menuDto.getCode());
        assertEquals(menu.getName(), menuDto.getName());
        assertEquals(menu.getCreated(), menuDto.getCreated());
        assertEquals(menu.getUpdated(), menuDto.getUpdated());
        assertEquals(menu.getProject(), projectMapper.toEntity(menuDto.getProject()));
    }
}
