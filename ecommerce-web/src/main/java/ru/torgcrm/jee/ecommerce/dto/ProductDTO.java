package ru.torgcrm.jee.ecommerce.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Product DTO class {@link ru.torgcrm.jee.ecommerce.domain.Product}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@NoArgsConstructor
public class ProductDTO extends AbstractProjectDTO {
    @Getter
    @Setter
    private String title;
}
