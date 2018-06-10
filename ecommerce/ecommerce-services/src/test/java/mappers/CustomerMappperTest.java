package mappers;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.torgcrm.jee.ecommerce.domain.Customer;
import ru.torgcrm.jee.ecommerce.dto.CustomerDTO;
import ru.torgcrm.jee.ecommerce.mappers.CustomerMapper;
import ru.torgcrm.jee.ecommerce.utils.generators.CustomerGenerator;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

/**
 * Customer mapper test.
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@RunWith(Arquillian.class)
public class CustomerMappperTest extends AbstractMapperTest {

    @Inject
    CustomerMapper customerMapper;
    @Inject
    CustomerGenerator customerGenerator;

    @Test
    @Override
    public void toEntityTest() {
        Customer customer = customerGenerator.createEntity();
        CustomerDTO customerDto = customerMapper.toDto(customer);
        assertEquals(customer.getBirthDate(), customerDto.getBirthDate());
        assertEquals(customer.getComments(), customerDto.getComments());
        assertEquals(customer.getFirstName(), customerDto.getFirstName());
        assertEquals(customer.getFullName(), customerDto.getFullName());
        assertEquals(customer.getLastName(), customerDto.getLastName());
        assertEquals(customer.getSecondName(), customerDto.getSecondName());
        assertEquals(customer.getCreated(), customerDto.getCreated());
        assertEquals(customer.getUpdated(), customerDto.getUpdated());
    }

    @Test
    @Override
    public void toDtoTest() {
        CustomerDTO customerDto = customerGenerator.createDto();
        Customer customer = customerMapper.toEntity(customerDto);
        assertEquals(customer.getBirthDate(), customerDto.getBirthDate());
        assertEquals(customer.getComments(), customerDto.getComments());
        assertEquals(customer.getFirstName(), customerDto.getFirstName());
        assertEquals(customer.getFullName(), customerDto.getFullName());
        assertEquals(customer.getLastName(), customerDto.getLastName());
        assertEquals(customer.getSecondName(), customerDto.getSecondName());
        assertEquals(customer.getCreated(), customerDto.getCreated());
        assertEquals(customer.getUpdated(), customerDto.getUpdated());
    }
}
