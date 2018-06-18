package ru.torgcrm.jee.ecommerce.repository.jpa;

import ru.torgcrm.jee.ecommerce.domain.Customer;
import ru.torgcrm.jee.ecommerce.repository.CustomerRepository;

import javax.enterprise.context.ApplicationScoped;

/**
 * JPA repository implementation for manage {@link Customer}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@ApplicationScoped
public class JpaCustomerRepository extends JpaAbstractProjectRepository<Customer> implements CustomerRepository {
}
