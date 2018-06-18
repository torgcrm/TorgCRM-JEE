package ru.torgcrm.jee.resources;

import lombok.extern.log4j.Log4j;
import ru.torgcrm.jee.ecommerce.dto.ProductDTO;
import ru.torgcrm.jee.ecommerce.dto.RawDataDTO;
import ru.torgcrm.jee.ecommerce.resources.AbstractResource;
import ru.torgcrm.jee.ecommerce.services.ProductService;
import ru.torgcrm.jee.ecommerce.services.RawDataService;
import ru.torgcrm.jee.security.Secured;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Path("/products")
@Stateless
@Log4j
public class CRMProductResource extends AbstractResource {

    @Inject
    private ProductService productService;
    @Inject
    private RawDataService rawDataService;

    @Path("/")
    @PUT
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String save(ProductDTO product) {
        List<RawDataDTO> rawDataDtoList = new ArrayList<>();
        product.getImages().forEach(id -> {
            RawDataDTO rawDataDTO = rawDataService.findById(id);
            rawDataDtoList.add(rawDataDTO);
        });
        product.setRawData(rawDataDtoList);
        productService.persist(product);
        return getOkStatus();
    }
}
