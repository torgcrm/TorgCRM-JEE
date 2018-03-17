package ru.torgcrm.jee.ecommerce.mappers;

import org.mapstruct.Mapper;
import ru.torgcrm.jee.ecommerce.domain.Catalog;
import ru.torgcrm.jee.ecommerce.dto.CatalogDTO;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Mapper(componentModel = "cdi")
public interface CatalogMapper extends EntityMapper<CatalogDTO, Catalog> {
}
