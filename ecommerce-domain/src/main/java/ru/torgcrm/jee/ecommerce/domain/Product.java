package ru.torgcrm.jee.ecommerce.domain;

import javax.persistence.*;

/**
 * Product entity. Contains information about product.
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Entity
@Table(name = "products")
@NamedQuery(name = Product.FIND_BY_PROJECT,
        query = "SELECT p FROM Product p WHERE p.project.id=:projectId")
public class Product extends AbstractWebPage {
    public static final String GEN_NAME = "Gen_Products";
    public static final String SEQ_NAME = "Seq_Products";
    public static final String FIND_BY_PROJECT = "FIND_BY_PROJECT";

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
        return "Product{" +
                "id=" + id +
                '}';
    }
}
