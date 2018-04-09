package ru.torgcrm.jee.resources;

import ru.torgcrm.jee.ecommerce.resources.AbstractResource;

import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * CRM Image resource
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Path("/image")
@Stateless
public class CRMImageResource extends AbstractResource {
    @POST
    @Path("/upload")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.WILDCARD)
    public void upload(byte[] base64) {
        System.out.println(base64);
    }
}
