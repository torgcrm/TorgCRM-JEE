package ru.torgcrm.jee.ecommerce.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Abstract web page based DTO
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
public abstract class AbstractWebPageDTO extends AbstractProjectDTO {
    private String title;
    private String keywords;
    private String description;
    private String slug;
}
