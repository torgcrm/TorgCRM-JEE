package ru.torgcrm.jee.ecommerce.utils.generators;

import ru.torgcrm.jee.ecommerce.domain.Order;
import ru.torgcrm.jee.ecommerce.domain.Product;
import ru.torgcrm.jee.ecommerce.dto.OrderDTO;
import ru.torgcrm.jee.ecommerce.dto.ProductDTO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Order generator.
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class OrderGenerator extends AbstractGenerator<Order, OrderDTO> {

    @Inject
    ProductGenerator productGenerator;
    @Inject
    ProjectGenerator projectGenerator;
    @Inject
    CustomerGenerator customerGenerator;

    @Override
    public Order createEntity() {
        Order order = new Order();
        order.setComment(dataFactory.getRandomWord());
        order.setPhone(dataFactory.getRandomWord());

        List<Product> products = new ArrayList<>();
        products.add(productGenerator.createEntity());
        products.add(productGenerator.createEntity());
        products.add(productGenerator.createEntity());

        order.setProducts(products);
        order.setCreated(dataFactory.getDate(2018, 1, 2));
        order.setUpdated(dataFactory.getDate(2018, 1, 2));
        order.setProject(projectGenerator.createEntity());
        order.setCustomer(customerGenerator.createEntity());
        order.setProcessId(dataFactory.getRandomChars(10));
        return order;
    }

    @Override
    public OrderDTO createDto() {
        OrderDTO orderDto = new OrderDTO();
        orderDto.setComment(dataFactory.getRandomWord());
        orderDto.setPhone(dataFactory.getRandomWord());

        List<ProductDTO> products = new ArrayList<>();
        products.add(productGenerator.createDto());
        products.add(productGenerator.createDto());
        products.add(productGenerator.createDto());

        orderDto.setProducts(products);
        orderDto.setCreated(dataFactory.getDate(2018, 1, 2));
        orderDto.setUpdated(dataFactory.getDate(2018, 1, 2));
        orderDto.setProject(projectGenerator.createDto());
        orderDto.setCustomer(customerGenerator.createDto());
        orderDto.setProcessId(dataFactory.getRandomChars(10));
        return orderDto;
    }
}
