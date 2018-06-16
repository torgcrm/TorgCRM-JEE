package mappers;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.torgcrm.jee.ecommerce.domain.Order;
import ru.torgcrm.jee.ecommerce.dto.OrderDTO;
import ru.torgcrm.jee.ecommerce.mappers.CustomerMapper;
import ru.torgcrm.jee.ecommerce.mappers.OrderMapper;
import ru.torgcrm.jee.ecommerce.utils.generators.OrderGenerator;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

/**
 * Order mapping test.
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@RunWith(Arquillian.class)
public class OrderMapperTest extends AbstractMapperTest {

    @Inject
    OrderGenerator orderGenerator;
    @Inject
    OrderMapper orderMapper;
    @Inject
    CustomerMapper customerMapper;

    @Test
    @Override
    public void toEntityTest() {
        Order order = orderGenerator.createEntity();
        OrderDTO orderDto = orderMapper.toDto(order);
        assertEquals(order.getComment(), orderDto.getComment());
        assertEquals(customerMapper.toDto(order.getCustomer()), orderDto.getCustomer());
        assertEquals(order.getPhone(), orderDto.getPhone());
        assertEquals(order.getProducts().size(), orderDto.getProducts().size());
        assertEquals(order.getProcessId(), orderDto.getProcessId());
        assertEquals(order.getCreated(), orderDto.getCreated());
        assertEquals(order.getUpdated(), orderDto.getUpdated());
    }

    @Test
    @Override
    public void toDtoTest() {
        OrderDTO orderDto = orderGenerator.createDto();
        Order order = orderMapper.toEntity(orderDto);
        assertEquals(order.getComment(), orderDto.getComment());
        assertEquals(order.getCustomer(), customerMapper.toEntity(orderDto.getCustomer()));
        assertEquals(order.getPhone(), orderDto.getPhone());
        assertEquals(order.getProducts().size(), orderDto.getProducts().size());
        assertEquals(order.getProcessId(), orderDto.getProcessId());
        assertEquals(order.getCreated(), orderDto.getCreated());
        assertEquals(order.getUpdated(), orderDto.getUpdated());
    }
}
