package ru.torgcrm.jee.ecommerce.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * DTO for project dto, e.g. page is depends on project
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
public abstract class AbstractProjectDTO extends GenericDTO {
    private ProjectDTO project;
}
