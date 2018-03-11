package ru.torgcrm.jee.ecommerce.resources;

import ru.torgcrm.jee.ecommerce.dto.MenuDTO;
import ru.torgcrm.jee.ecommerce.services.IMenuService;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Controller for menu {@link MenuDTO}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Path("/menu")
@Stateless
public class MenuResource extends AbstractResource {

    @Inject
    private IMenuService menuService;

    /**
     * Get menu by code
     *
     * @param code menu code
     * @return {@link MenuDTO}
     */
    @GET
    @Path("{code}")
    @Produces(MediaType.APPLICATION_JSON)
    public MenuDTO getMenuByCode(@PathParam("code") String code) {
        return menuService.findByProjectIdAndCode(getCurrentProjectId(), code);
    }
}
