package ru.torgcrm.jee.ecommerce.resources;

import ru.torgcrm.jee.ecommerce.dto.ProductDTO;
import ru.torgcrm.jee.ecommerce.services.ICatalogService;
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
 * Resource for catalog
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Path("/catalog")
@Stateless
public class CatalogResource extends AbstractResource {

    @Inject
    private ICatalogService catalogService;
    @Inject
    private IProductService productService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List getCatalog() {
        return catalogService.findAllByProjectId(getCurrentProjectId());
    }

    @GET
    @Path("{slug}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProductDTO> getProductsByCatalogSlug(@PathParam("slug") String slug) {
        return productService.findAllByCatalogSlug(slug);
    }
}
