package ru.torgcrm.jee.ecommerce.domain;

import lombok.Data;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

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

    @Override
    public String toString() {
        return "GenericEntity{" +
                "id=" + id +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GenericEntity that = (GenericEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(created, that.created) &&
                Objects.equals(updated, that.updated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, created, updated);
    }
}
