package ru.torgcrm.jee.resources;

import lombok.extern.log4j.Log4j;
import ru.torgcrm.jee.ecommerce.dto.RawDataDTO;
import ru.torgcrm.jee.ecommerce.resources.AbstractResource;
import ru.torgcrm.jee.ecommerce.services.RawDataService;
import ru.torgcrm.jee.security.Secured;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * CRM Image resource
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Path("/image")
@Stateless
@Log4j
public class CRMImageResource extends AbstractResource {

    @Inject
    private RawDataService rawDataService;

    @POST
    @Path("/upload")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.WILDCARD)
    @Secured
    public Long upload(byte[] base64) {
        RawDataDTO rawDataDTO = new RawDataDTO();
        rawDataDTO.setData(base64);
        RawDataDTO saved = rawDataService.persist(rawDataDTO);
        return saved.getId();
    }

    @GET
    @Secured
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.WILDCARD)
    public List getAll() {
        return rawDataService.findAll();
    }
}
