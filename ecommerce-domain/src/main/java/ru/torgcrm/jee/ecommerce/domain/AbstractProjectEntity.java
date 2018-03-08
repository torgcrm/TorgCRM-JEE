package ru.torgcrm.jee.ecommerce.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * Entities of project
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@MappedSuperclass
public abstract class AbstractProjectEntity extends GenericEntity {
    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "project_id")
    private Project project;

    @Override
    public String toString() {
        return "AbstractProjectEntity{" +
                "project=" + project +
                '}';
    }
}
