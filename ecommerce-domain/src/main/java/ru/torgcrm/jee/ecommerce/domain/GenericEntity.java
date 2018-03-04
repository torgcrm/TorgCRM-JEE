package ru.torgcrm.jee.ecommerce.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.util.Date;

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

    public abstract Long getId();
}
