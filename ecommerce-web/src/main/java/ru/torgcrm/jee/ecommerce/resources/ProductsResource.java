package ru.torgcrm.jee.ecommerce.resources;

import ru.torgcrm.jee.ecommerce.dto.ProductDTO;
import ru.torgcrm.jee.ecommerce.services.IProductService;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
public class ProductsResource extends AbstractResource {

    @Inject
    private IProductService productService;

    /**
     * Get all products {@link ProductDTO} of current project.
     * Project you will get from custom header, see {@link AbstractResource}.
     * Header - Project-Host
     *
     * @return list of {@link ProductDTO}
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProductDTO> getProducts() {
        List<ProductDTO> products = productService.findAllByProjectId(getCurrentProjectId());
        return products;
    }

    /**
     * Get product by slug, when you open product detail page
     *
     * @param slug product slug
     * @return {@link ProductDTO}
     */
    @GET
    @Path("/slug/{slug}")
    @Produces(MediaType.APPLICATION_JSON)
    public ProductDTO getProductBySlug(@PathParam("slug") String slug) {
        return productService.findBySlugAndProjectId(slug, getCurrentProjectId());
    }
}
