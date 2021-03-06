package ru.torgcrm.jee.resources;

import ru.torgcrm.jee.ecommerce.dto.CustomerDTO;
import ru.torgcrm.jee.ecommerce.resources.AbstractResource;
import ru.torgcrm.jee.ecommerce.services.CustomerService;
import ru.torgcrm.jee.ecommerce.security.Secured;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Resource for customers
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Path("/customers")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CRMCustomerResource extends AbstractResource {
    @Inject
    CustomerService customerService;

    @GET
    @Secured
    public List<CustomerDTO> findAll() {
        return customerService.findAll();
    }
}
