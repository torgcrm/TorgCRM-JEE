package ru.torgcrm.jee.ecommerce.resources;

import ru.torgcrm.jee.ecommerce.dto.MenuDTO;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

/**
 * Controller for menu {@link MenuDTO}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Path("/menu")
@Stateless
public class MenuResource {
    @GET
    public List<MenuDTO> list() {
        return null;
    }
}
