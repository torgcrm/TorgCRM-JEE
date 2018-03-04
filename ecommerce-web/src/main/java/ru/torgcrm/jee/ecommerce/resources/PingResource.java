package ru.torgcrm.jee.ecommerce.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Ping resource
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Path("/ping")
public class PingResource {
    @GET
    public String ping() {
        return "ok";
    }
}
