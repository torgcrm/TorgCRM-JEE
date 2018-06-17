package repository;

import ru.torgcrm.jee.ecommerce.domain.Order;
import ru.torgcrm.jee.ecommerce.repository.OrderRepository;
import ru.torgcrm.jee.ecommerce.utils.generators.OrderGenerator;

import javax.inject.Inject;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public class JpaOrderRepositoryTest extends AbstractRepositoryTest
        <Order, OrderRepository, OrderGenerator> {

    @Inject
    private OrderRepository orderRepository;
    @Inject
    private OrderGenerator orderGenerator;

    @Override
    protected OrderRepository getRepository() {
        return orderRepository;
    }

    @Override
    protected OrderGenerator getGenerator() {
        return orderGenerator;
    }
}
