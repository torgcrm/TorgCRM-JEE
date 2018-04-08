package ru.torgcrm.jee.ecommerce.mappers;

import org.mapstruct.Mapper;
import ru.torgcrm.jee.ecommerce.domain.Customer;
import ru.torgcrm.jee.ecommerce.domain.Order;
import ru.torgcrm.jee.ecommerce.dto.CustomerDTO;
import ru.torgcrm.jee.ecommerce.dto.OrderDTO;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Mapper(componentModel = "cdi")
public interface CustomerMapper extends EntityMapper<CustomerDTO, Customer> {
}

