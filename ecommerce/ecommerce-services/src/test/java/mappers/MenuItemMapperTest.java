package mappers;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.torgcrm.jee.ecommerce.domain.MenuItem;
import ru.torgcrm.jee.ecommerce.dto.MenuItemDTO;
import ru.torgcrm.jee.ecommerce.mappers.MenuItemMapper;
import ru.torgcrm.jee.ecommerce.mappers.MenuMapper;
import ru.torgcrm.jee.ecommerce.mappers.ProjectMapper;
import ru.torgcrm.jee.ecommerce.utils.generators.MenuItemGenerator;

import javax.inject.Inject;

import static org.junit.Assert.*;

/**
 * Menu item mapper test.
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@RunWith(Arquillian.class)
public class MenuItemMapperTest extends AbstractMapperTest {

    @Inject
    MenuItemGenerator menuItemGenerator;
    @Inject
    MenuItemMapper menuItemMapper;
    @Inject
    MenuMapper menuMapper;
    @Inject
    ProjectMapper projectMapper;

    @Test
    @Override
    public void toEntityTest() {
        MenuItem menuItem = menuItemGenerator.createEntity();
        MenuItemDTO menuItemDto = menuItemMapper.toDto(menuItem);
        assertEquals(menuItem.getCode(), menuItemDto.getCode());
        assertEquals(menuItem.getLink(), menuItemDto.getLink());
        assertEquals(menuMapper.toDto(menuItem.getMenu()), menuItemDto.getMenu());
        assertEquals(menuItem.getCreated(), menuItemDto.getCreated());
        assertEquals(projectMapper.toDto(menuItem.getProject()), menuItemDto.getProject());
        assertEquals(menuItem.getUpdated(), menuItemDto.getUpdated());
    }

    @Test
    @Override
    public void toDtoTest() {
        MenuItemDTO menuItemDto = menuItemGenerator.createDto();
        MenuItem menuItem = menuItemMapper.toEntity(menuItemDto);
        assertEquals(menuItem.getCode(), menuItemDto.getCode());
        assertEquals(menuItem.getLink(), menuItemDto.getLink());
        assertEquals(menuItem.getMenu(), menuMapper.toEntity(menuItemDto.getMenu()));
        assertEquals(menuItem.getCreated(), menuItemDto.getCreated());
        assertEquals(menuItem.getProject(), projectMapper.toEntity(menuItemDto.getProject()));
        assertEquals(menuItem.getUpdated(), menuItemDto.getUpdated());
    }
}
