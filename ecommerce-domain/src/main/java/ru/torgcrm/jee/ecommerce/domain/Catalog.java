package ru.torgcrm.jee.ecommerce.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Products catalog entity
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Entity
@Table(name = "catalog")
public class Catalog extends AbstractWebPage {
    public static final String GEN_NAME = "Gen_Catalog";
    public static final String SEQ_NAME = "Seq_Catalog";

    @Id
    @SequenceGenerator(sequenceName = SEQ_NAME, name = GEN_NAME)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GEN_NAME)
    private Long id;
    @Getter
    @Setter
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "catalog")
    private List<Product> products;

    @Override
    public Long getId() {
        return this.id;
    }
}
