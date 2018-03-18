package ru.torgcrm.jee.ecommerce.repository.jpa;

import ru.torgcrm.jee.ecommerce.domain.Order;
import ru.torgcrm.jee.ecommerce.repository.OrderRepository;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@ApplicationScoped
public class JpaOrderRepository extends JpaGenericRepository<Order> implements OrderRepository {
}
