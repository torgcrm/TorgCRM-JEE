package ru.torgcrm.jee.ecommerce.services;

import ru.torgcrm.jee.ecommerce.dto.CustomerDTO;
import ru.torgcrm.jee.ecommerce.utils.generators.CustomerGenerator;

import javax.inject.Inject;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public class CustomerServiceTest extends AbstractProjectServiceTest
        <CustomerDTO, CustomerService, CustomerGenerator> {

    @Inject
    CustomerService service;
    @Inject
    CustomerGenerator generator;

    @Override
    protected CustomerService getService() {
        return service;
    }

    @Override
    protected CustomerGenerator getGenerator() {
        return generator;
    }
}
