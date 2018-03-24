package ru.torgcrm.jee.resources;

import ru.torgcrm.jee.ecommerce.dto.OrderDTO;
import ru.torgcrm.jee.ecommerce.services.IOrderService;
import ru.torgcrm.jee.security.Secured;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Path("/orders")
@Stateless
public class CRMOrderResource {

    @Inject
    private IOrderService orderService;

    @GET
    @Secured
    public List<OrderDTO> getAll() {
        return orderService.findAll();
    }
}
