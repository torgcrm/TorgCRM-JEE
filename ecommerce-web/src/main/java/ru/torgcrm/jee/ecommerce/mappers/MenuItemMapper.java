package ru.torgcrm.jee.ecommerce.mappers;

import org.mapstruct.Mapper;
import ru.torgcrm.jee.ecommerce.domain.MenuItem;
import ru.torgcrm.jee.ecommerce.dto.MenuItemDTO;

/**
 * Mapper for Menu item
 * {@link MenuItem}
 * {@link MenuItemDTO}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Mapper(componentModel = "cdi")
public interface MenuItemMapper extends EntityMapper<MenuItemDTO, MenuItem> {
}
