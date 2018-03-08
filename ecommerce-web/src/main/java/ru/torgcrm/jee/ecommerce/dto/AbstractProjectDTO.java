package ru.torgcrm.jee.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * DTO for project dto, e.g. page is depends on project
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public abstract class AbstractProjectDTO extends GenericDTO {
    @Getter
    @Setter
    private ProjectDTO project;
}
