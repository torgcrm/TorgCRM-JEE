package ru.torgcrm.jee.ecommerce.domain;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product extends GenericEntity {
    public static final String GEN_NAME = "Gen_Product";
    public static final String SEQ_NAME = "Seq_Product";

    @Id
    @SequenceGenerator(sequenceName = SEQ_NAME, name = GEN_NAME)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GEN_NAME)
    private Long id;

    @Override
    public Long getId() {
        return this.id;
    }
}
