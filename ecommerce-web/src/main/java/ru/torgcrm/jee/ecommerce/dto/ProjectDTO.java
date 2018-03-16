package ru.torgcrm.jee.ecommerce.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Lob;

/**
 * DTO for Project
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class ProjectDTO extends GenericDTO {
    private String title;
    private String code;
    private String host;
    private String metaDescription;
    private String metaKeywords;
    private String phone;
    @Lob
    private String logo;
}
