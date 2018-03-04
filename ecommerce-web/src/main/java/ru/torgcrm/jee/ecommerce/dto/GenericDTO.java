package ru.torgcrm.jee.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Generic DTO class
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public abstract class GenericDTO {
    @Getter
    @Setter
    private Long id;
}
