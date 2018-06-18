package ru.torgcrm.jee.ecommerce.services.impl;

import ru.torgcrm.jee.ecommerce.dto.OrderDTO;
import ru.torgcrm.jee.ecommerce.mappers.OrderMapper;
import ru.torgcrm.jee.ecommerce.repository.OrderRepository;
import ru.torgcrm.jee.ecommerce.services.OrderService;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class OrderServiceImpl extends AbstractProjectServiceImpl<OrderDTO, OrderRepository, OrderMapper>
        implements OrderService {
    @Inject
    OrderRepository repository;
    @Inject
    OrderMapper mapper;

    @Override
    protected OrderRepository getRepository() {
        return repository;
    }

    @Override
    protected OrderMapper getMapper() {
        return mapper;
    }
}
