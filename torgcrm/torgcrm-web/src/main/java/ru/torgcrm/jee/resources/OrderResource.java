package ru.torgcrm.jee.resources;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Path("/orders")
@Stateless
public class OrderResource {
    @GET
    public List getAll() {
        return null;
    }
}
