package ru.torgcrm.jee.ecommerce.mappers;

import org.mapstruct.Mapper;
import ru.torgcrm.jee.ecommerce.domain.Order;
import ru.torgcrm.jee.ecommerce.dto.OrderDTO;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Mapper(componentModel = "cdi")
public interface OrderMapper extends EntityMapper<OrderDTO, Order> {
}

