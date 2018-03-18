package ru.torgcrm.jee.ecommerce.domain;

import lombok.Data;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * Generic entity
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Data
@MappedSuperclass
public abstract class GenericEntity implements Serializable {
    @Setter
    private Long id;
    private Date created;
    private Date updated;

    /**
     * Override this to return id
     *
     * @return {@link Long} unique id
     */
    public abstract Long getId();
}
