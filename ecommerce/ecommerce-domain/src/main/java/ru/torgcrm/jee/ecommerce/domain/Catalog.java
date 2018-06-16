package ru.torgcrm.jee.ecommerce.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

/**
 * Products catalog entity
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "catalog")
public class Catalog extends AbstractWebPage {
    public static final String GEN_NAME = "Gen_Catalog";
    public static final String SEQ_NAME = "Seq_Catalog";

    @Id
    @SequenceGenerator(sequenceName = SEQ_NAME, name = GEN_NAME, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GEN_NAME)
    private Long id;
    @OneToMany(fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    }, mappedBy = "catalog")
    private List<Product> products;

    @Override
    public Long getId() {
        return this.id;
    }
}
