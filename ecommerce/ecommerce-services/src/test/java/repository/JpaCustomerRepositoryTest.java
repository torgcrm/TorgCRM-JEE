package repository;

import ru.torgcrm.jee.ecommerce.domain.Customer;
import ru.torgcrm.jee.ecommerce.repository.CustomerRepository;
import ru.torgcrm.jee.ecommerce.utils.generators.CustomerGenerator;

import javax.inject.Inject;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public class JpaCustomerRepositoryTest extends AbstractProjectRepositoryTest
        <Customer, CustomerRepository, CustomerGenerator> {

    @Inject
    private CustomerRepository customerRepository;
    @Inject
    private CustomerGenerator customerGenerator;

    @Override
    protected CustomerRepository getRepository() {
        return customerRepository;
    }

    @Override
    protected CustomerGenerator getGenerator() {
        return customerGenerator;
    }
}
