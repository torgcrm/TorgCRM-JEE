package ru.torgcrm.jee.ecommerce.mappers;

import org.mapstruct.Mapper;
import ru.torgcrm.jee.ecommerce.domain.Page;
import ru.torgcrm.jee.ecommerce.dto.PageDTO;

/**
 * Mapper for Menu item
 * {@link Page}
 * {@link PageDTO}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Mapper(componentModel = "cdi")
public interface PageMapper extends EntityMapper<PageDTO, Page> {
}
