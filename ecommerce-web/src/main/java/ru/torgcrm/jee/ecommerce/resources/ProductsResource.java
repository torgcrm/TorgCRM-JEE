package ru.torgcrm.jee.ecommerce.resources;

import ru.torgcrm.jee.ecommerce.dto.ProductDTO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Path("/products")
public class ProductsResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProductDTO> getProducts() {
        List<ProductDTO> products =
                Stream.generate(ProductDTO::new)
                        .limit(10)
                        .collect(Collectors.toList());
        products.forEach(product -> product.setTitle("Product title"));
        return products;
    }
}
