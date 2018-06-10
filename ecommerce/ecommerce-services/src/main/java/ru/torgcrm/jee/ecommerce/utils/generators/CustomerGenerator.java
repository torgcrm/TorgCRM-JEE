package ru.torgcrm.jee.ecommerce.utils.generators;

import ru.torgcrm.jee.ecommerce.domain.Customer;
import ru.torgcrm.jee.ecommerce.dto.CustomerDTO;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Customer generator.
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class CustomerGenerator extends AbstractGenerator<Customer, CustomerDTO> {

    @Inject
    ProjectGenerator projectGenerator;

    @Override
    public Customer createEntity() {
        Customer customer = new Customer();
        customer.setBirthDate(dataFactory.getBirthDate());
        customer.setComments(dataFactory.getRandomText(100));
        customer.setFirstName(dataFactory.getFirstName());
        customer.setFullName(dataFactory.getLastName());
        customer.setLastName(dataFactory.getLastName());
        customer.setSecondName(dataFactory.getFirstName());
        customer.setCreated(dataFactory.getDate(2018, 1, 2));
        customer.setUpdated(dataFactory.getDate(2018, 1, 2));
        customer.setProject(projectGenerator.createEntity());
        return customer;
    }

    @Override
    public CustomerDTO createDto() {
        CustomerDTO customerDto = new CustomerDTO();
        customerDto.setBirthDate(dataFactory.getBirthDate());
        customerDto.setComments(dataFactory.getRandomText(100));
        customerDto.setFirstName(dataFactory.getFirstName());
        customerDto.setFullName(dataFactory.getLastName());
        customerDto.setLastName(dataFactory.getLastName());
        customerDto.setSecondName(dataFactory.getFirstName());
        customerDto.setCreated(dataFactory.getDate(2018, 1, 2));
        customerDto.setUpdated(dataFactory.getDate(2018, 1, 2));
        customerDto.setProject(projectGenerator.createDto());
        return customerDto;
    }
}
