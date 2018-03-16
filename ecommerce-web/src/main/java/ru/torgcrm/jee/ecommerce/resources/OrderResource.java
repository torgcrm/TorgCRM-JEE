package ru.torgcrm.jee.ecommerce.resources;

import org.flowable.engine.RuntimeService;
import ru.torgcrm.jee.ecommerce.dto.OrderDTO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * Order resource
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Path("/orders")
@Stateless
public class OrderResource extends AbstractResource {

    @Inject
    private RuntimeService runtimeService;

    @POST
    @Path("/one-click")
    @Consumes(MediaType.APPLICATION_JSON)
    public void createOneClickOrder(OrderDTO order) {
        runtimeService.startProcessInstanceByKey("newOrder");
        System.out.println(order.getPhone());
    }

    @GET
    public OrderDTO getOrders() {
        return new OrderDTO();
    }
}
