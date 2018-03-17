package ru.torgcrm.jee.ecommerce.mappers;

import org.mapstruct.Mapper;
import ru.torgcrm.jee.ecommerce.domain.Menu;
import ru.torgcrm.jee.ecommerce.dto.MenuDTO;

/**
 * Mapper for Menu item
 * {@link Menu}
 * {@link MenuDTO}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Mapper(componentModel = "cdi")
public interface MenuMapper extends EntityMapper<MenuDTO, Menu> {
}
