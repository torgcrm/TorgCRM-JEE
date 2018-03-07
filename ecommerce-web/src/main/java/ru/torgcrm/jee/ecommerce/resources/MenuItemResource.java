package ru.torgcrm.jee.ecommerce.resources;

import ru.torgcrm.jee.ecommerce.dto.MenuItemDTO;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

/**
 * Controller for Menu items
 * see {@link MenuItemDTO}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Path("/menu_items")
@Stateless
public class MenuItemResource {
    @GET
    public List<MenuItemDTO> list() {
        return null;
    }
}
