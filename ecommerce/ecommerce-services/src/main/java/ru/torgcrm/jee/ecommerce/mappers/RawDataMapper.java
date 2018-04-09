package ru.torgcrm.jee.ecommerce.mappers;

import org.mapstruct.Mapper;
import ru.torgcrm.jee.ecommerce.domain.RawData;
import ru.torgcrm.jee.ecommerce.dto.RawDataDTO;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Mapper(componentModel = "cdi")
public interface RawDataMapper extends EntityMapper<RawDataDTO, RawData> {
}
