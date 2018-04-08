package ru.torgcrm.jee.ecommerce.services.impl;

import ru.torgcrm.jee.ecommerce.dto.CustomerDTO;
import ru.torgcrm.jee.ecommerce.mappers.CustomerMapper;
import ru.torgcrm.jee.ecommerce.repository.CustomerRepository;
import ru.torgcrm.jee.ecommerce.services.ICustomerService;

import javax.ejb.Stateless;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class CustomerServiceImpl extends GenericServiceImpl<CustomerDTO, CustomerRepository, CustomerMapper>
        implements ICustomerService {
}
