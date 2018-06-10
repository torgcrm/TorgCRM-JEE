package ru.torgcrm.jee.ecommerce.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * Generic DTO class
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
public abstract class GenericDTO {
    private Long id;
    private Date created;
    private Date updated;
}
