package ru.torgcrm.jee.ecommerce.resources;

import ru.torgcrm.jee.ecommerce.dto.ProductDTO;
import ru.torgcrm.jee.ecommerce.services.IProductService;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Product resource
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Path("/products")
@Stateless
public class ProductsResource {

    @Inject
    private IProductService productService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProductDTO> getProducts() {
        List<ProductDTO> products = productService.findAll();
        return products;
    }
}
