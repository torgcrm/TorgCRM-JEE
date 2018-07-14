package ru.torgcrm.jee.ecommerce.resources;

import ru.torgcrm.jee.ecommerce.annotations.PATCH;
import ru.torgcrm.jee.ecommerce.dto.CatalogDTO;
import ru.torgcrm.jee.ecommerce.dto.PageFilter;
import ru.torgcrm.jee.ecommerce.security.Secured;
import ru.torgcrm.jee.ecommerce.services.CatalogService;
import ru.torgcrm.jee.ecommerce.services.ProductService;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Resource for catalog
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Path("/catalog")
@Stateless
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CatalogResource extends AbstractResource {

    @Inject
    CatalogService catalogService;
    @Inject
    ProductService productService;

    @GET
    @Path("/list")
    public List getCatalogList(PageFilter pageFilter) {
        return catalogService.findAllByProjectId(getCurrentProjectId());
    }

    @Secured
    @POST
    @Path("/create")
    public CatalogDTO createCatalog(CatalogDTO catalog) {
        return catalogService.persist(catalog);
    }

    @Secured
    @PATCH
    @Path("/update")
    public CatalogDTO updateCatalog(CatalogDTO catalog) {
        return catalogService.merge(catalog);
    }

    @Secured
    @DELETE
    @Path("/delete/{id}")
    public String deleteCatalog(@PathParam("id") Long id) {
        return getOkStatus();
    }
}
