package ru.torgcrm.jee.ecommerce.resources;

import ru.torgcrm.jee.ecommerce.dto.MenuDTO;
import ru.torgcrm.jee.ecommerce.dto.MenuItemDTO;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.ArrayList;
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
    @Path("{code}")
    public MenuDTO getMenuByCode(@PathParam("code") String code) {
        MenuDTO menu = new MenuDTO();
        menu.setName("Top menu");

        List<MenuItemDTO> items = new ArrayList<>();
        MenuItemDTO item = new MenuItemDTO();
        item.setName("Sample item");
        items.add(item);

        menu.setMenuItems(items);

        return menu;
    }
}
