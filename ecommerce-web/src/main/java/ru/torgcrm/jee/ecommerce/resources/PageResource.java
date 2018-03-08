package ru.torgcrm.jee.ecommerce.resources;

import ru.torgcrm.jee.ecommerce.dto.PageDTO;

import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

/**
 * Page resource {@link PageDTO}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Path("/pages")
@Stateless
public class PageResource {
    @GET
    public List<PageDTO> list(HttpServletRequest request) {
        return null;
    }
}
