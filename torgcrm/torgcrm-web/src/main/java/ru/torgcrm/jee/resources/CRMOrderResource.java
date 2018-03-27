package ru.torgcrm.jee.resources;

import ru.torgcrm.jee.ecommerce.dto.OrderDTO;
import ru.torgcrm.jee.ecommerce.services.IOrderService;
import ru.torgcrm.jee.security.Secured;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Path("/orders")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CRMOrderResource {

    @Inject
    private IOrderService orderService;

    @GET
    @Secured
    public List<OrderDTO> getAll() {
        return orderService.findAll();
    }

    @DELETE
    @Path("/delete/{id}")
    public String deleteOrder(@PathParam("id") Long orderId) {
        orderService.delete(orderId);
        return getOkStatus();
    }

    protected String getOkStatus() {
        return "{status: 'ok'}";
    }
}
