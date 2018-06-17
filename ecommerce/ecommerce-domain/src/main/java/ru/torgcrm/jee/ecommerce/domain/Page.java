package ru.torgcrm.jee.ecommerce.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * Product entity. Contains information about product.
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "pages")
public class Page extends AbstractWebPage {
    public static final String GEN_NAME = "Gen_Pages";
    public static final String SEQ_NAME = "Seq_Pages";

    @Id
    @SequenceGenerator(sequenceName = SEQ_NAME, name = GEN_NAME, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GEN_NAME)
    private Long id;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Page{" +
                "id=" + id +
                '}';
    }
}
