package ru.torgcrm.jee.ecommerce.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;

/**
 * Abstract entity for web page based entity
 * with titles, keywords and description fields
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@MappedSuperclass
public abstract class AbstractWebPage extends GenericEntity {
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
