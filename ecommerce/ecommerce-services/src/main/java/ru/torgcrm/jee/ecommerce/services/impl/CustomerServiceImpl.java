package ru.torgcrm.jee.ecommerce.services.impl;

import ru.torgcrm.jee.ecommerce.dto.CustomerDTO;
import ru.torgcrm.jee.ecommerce.mappers.CustomerMapper;
import ru.torgcrm.jee.ecommerce.repository.CustomerRepository;
import ru.torgcrm.jee.ecommerce.services.AbstractProjectService;
import ru.torgcrm.jee.ecommerce.services.CustomerService;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class CustomerServiceImpl extends AbstractProjectServiceImpl<CustomerDTO, CustomerRepository, CustomerMapper>
        implements CustomerService {

    @Inject
    CustomerRepository repository;
    @Inject
    CustomerMapper mapper;

    @Override
    protected CustomerRepository getRepository() {
        return repository;
    }

    @Override
    protected CustomerMapper getMapper() {
        return mapper;
    }
}
