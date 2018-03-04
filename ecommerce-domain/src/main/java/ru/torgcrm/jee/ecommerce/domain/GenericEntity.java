package ru.torgcrm.jee.ecommerce.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Generic entity
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@MappedSuperclass
public abstract class GenericEntity {
    @Setter
    private Long id;
    @Getter
    @Setter
    private Date created;
    @Getter
    @Setter
    private Date updated;

    /**
     * Override this to return id
     *
     * @return {@link Long} unique id
     */
    public abstract Long getId();

    @Override
    public String toString() {
        return "GenericEntity{" +
                "id=" + id +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
