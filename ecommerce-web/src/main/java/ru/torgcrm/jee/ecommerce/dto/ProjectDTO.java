package ru.torgcrm.jee.ecommerce.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DTO for Project
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@NoArgsConstructor
public class ProjectDTO extends GenericDTO {
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private String code;
    @Getter
    @Setter
    private String host;
    @Getter
    @Setter
    private String description;
}
