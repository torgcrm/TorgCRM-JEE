package ru.torgcrm.jee.ecommerce.mappers;

import org.mapstruct.Mapper;
import ru.torgcrm.jee.ecommerce.domain.Product;
import ru.torgcrm.jee.ecommerce.dto.ProductDTO;

@Mapper(componentModel = "cdi")
public interface ProductMapper extends EntityMapper<ProductDTO, Product> {
}
