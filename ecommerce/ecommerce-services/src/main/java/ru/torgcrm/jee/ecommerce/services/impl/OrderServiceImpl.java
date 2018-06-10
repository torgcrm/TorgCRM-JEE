package ru.torgcrm.jee.ecommerce.services.impl;

import ru.torgcrm.jee.ecommerce.dto.OrderDTO;
import ru.torgcrm.jee.ecommerce.mappers.OrderMapper;
import ru.torgcrm.jee.ecommerce.repository.OrderRepository;
import ru.torgcrm.jee.ecommerce.services.OrderService;

import javax.ejb.Stateless;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class OrderServiceImpl extends GenericServiceImpl<OrderDTO, OrderRepository, OrderMapper>
        implements OrderService {
}
