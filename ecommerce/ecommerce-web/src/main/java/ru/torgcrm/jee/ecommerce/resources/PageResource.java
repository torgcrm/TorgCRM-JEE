package ru.torgcrm.jee.ecommerce.resources;

import ru.torgcrm.jee.ecommerce.dto.PageDTO;
import ru.torgcrm.jee.ecommerce.services.IPageService;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Page resource {@link PageDTO}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Path("/pages")
@Stateless
public class PageResource extends AbstractResource {

    @Inject
    private IPageService pageService;

    @GET
    @Path("{slug}")
    @Produces(MediaType.APPLICATION_JSON)
    public PageDTO getPageBySlug(@PathParam("slug") String slug) {
        return pageService.findBySlugAndProjectId(slug, getCurrentProjectId());
    }
}
