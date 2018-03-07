package ru.torgcrm.jee.ecommerce.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Abstract web page based DTO
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@NoArgsConstructor
public abstract class AbstractWebPageDTO extends GenericDTO {
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private String keywords;
    @Getter
    @Setter
    private String description;
}
