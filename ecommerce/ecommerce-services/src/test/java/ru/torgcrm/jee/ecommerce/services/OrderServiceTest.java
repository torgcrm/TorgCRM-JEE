package ru.torgcrm.jee.ecommerce.services;

import ru.torgcrm.jee.ecommerce.dto.OrderDTO;
import ru.torgcrm.jee.ecommerce.utils.generators.OrderGenerator;

import javax.inject.Inject;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public class OrderServiceTest extends AbstractProjectServiceTest
        <OrderDTO, OrderService, OrderGenerator> {

    @Inject
    OrderService service;
    @Inject
    OrderGenerator generator;

    @Override
    protected OrderService getService() {
        return service;
    }

    @Override
    protected OrderGenerator getGenerator() {
        return generator;
    }
}
