package ru.torgcrm.jee.ecommerce.resources;

import ru.torgcrm.jee.ecommerce.dto.ProjectDTO;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Project resource
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Path("/project")
@Stateless
public class ProjectResource extends AbstractResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ProjectDTO getProjectByString() {
        return getCurrentProject();
    }
}
