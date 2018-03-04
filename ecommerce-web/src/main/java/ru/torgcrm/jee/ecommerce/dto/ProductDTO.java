package ru.torgcrm.jee.ecommerce.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class ProductDTO extends GenericDTO {
    @Getter
    @Setter
    private String title;
}
