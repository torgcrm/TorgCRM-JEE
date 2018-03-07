package ru.torgcrm.jee.ecommerce.domain;

import javax.persistence.*;

/**
 * Product entity. Contains information about product.
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Entity
@Table(name = "pages")
public class Page extends AbstractWebPage {
    public static final String GEN_NAME = "Gen_Page";
    public static final String SEQ_NAME = "Seq_Page";

    @Id
    @SequenceGenerator(sequenceName = SEQ_NAME, name = GEN_NAME)
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
