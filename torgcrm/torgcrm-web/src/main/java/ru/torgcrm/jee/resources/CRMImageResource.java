package ru.torgcrm.jee.resources;

import lombok.extern.log4j.Log4j;
import ru.torgcrm.jee.ecommerce.dto.RawDataDTO;
import ru.torgcrm.jee.ecommerce.resources.AbstractResource;
import ru.torgcrm.jee.ecommerce.services.IRawDataService;

import javax.ejb.Stateless;
import javax.inject.Inject;
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
@Log4j
public class CRMImageResource extends AbstractResource {

    @Inject
    private IRawDataService rawDataService;

    @POST
    @Path("/upload")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.WILDCARD)
    public void upload(byte[] base64) {
        RawDataDTO rawDataDTO = new RawDataDTO();
        rawDataDTO.setData(base64);
        rawDataService.save(rawDataDTO);
    }
}
