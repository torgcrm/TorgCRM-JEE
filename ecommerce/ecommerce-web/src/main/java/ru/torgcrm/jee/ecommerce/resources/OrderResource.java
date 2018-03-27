package ru.torgcrm.jee.ecommerce.resources;

import org.flowable.engine.RuntimeService;
import org.flowable.engine.runtime.ProcessInstance;
import org.springframework.transaction.annotation.Transactional;
import ru.torgcrm.jee.ecommerce.dto.OrderDTO;
import ru.torgcrm.jee.ecommerce.dto.ProductDTO;
import ru.torgcrm.jee.ecommerce.services.IOrderService;
import ru.torgcrm.jee.ecommerce.services.IProductService;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Order resource
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Path("/orders")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class OrderResource extends AbstractResource {

    @Inject
    private IOrderService orderService;
    @Inject
    private RuntimeService runtimeService;
    @Inject
    private IProductService productService;

    @POST
    @Path("/one-click")
    @Transactional
    public String createOneClickOrder(OrderDTO order) {
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("newOrder");
        order.setProcessId(processInstance.getProcessDefinitionId());
        ProductDTO product = productService.findById(order.getProductId());
        List<ProductDTO> products = new ArrayList<>();
        products.add(product);
        order.setProducts(products);
        order.setProject(getCurrentProject());

        orderService.save(order);
        return getOkStatus();
    }

    @GET
    public OrderDTO getOrders() {
        return new OrderDTO();
    }
}
