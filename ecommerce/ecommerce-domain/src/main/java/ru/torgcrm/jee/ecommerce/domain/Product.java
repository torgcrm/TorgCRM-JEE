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
@Table(name = "products")
@NamedQueries({
        @NamedQuery(name = Product.FIND_BY_PROJECT,
                query = "SELECT p FROM Product p WHERE p.project.id=:projectId"),
        @NamedQuery(name = Product.FIND_BY_SLUG_AND_PROJECT,
                query = "SELECT p FROM Product p WHERE p.slug=:slug and p.project.id=:projectId"),
        @NamedQuery(name = Product.FIND_BY_CATALOG_SLUG,
                query = "SELECT p from Product p where p.catalog.slug=:catalogSlug")
})
public class Product extends AbstractWebPage {
    public static final String GEN_NAME = "Gen_Products";
    public static final String SEQ_NAME = "Seq_Products";
    public static final String FIND_BY_PROJECT = "FIND_BY_PROJECT";
    public static final String FIND_BY_SLUG_AND_PROJECT = "FIND_BY_SLUG_AND_PROJECT";
    public static final String FIND_BY_CATALOG_SLUG = "FIND_BY_CATALOG_SLUG";

    @Id
    @SequenceGenerator(sequenceName = SEQ_NAME, name = GEN_NAME)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GEN_NAME)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "catalog_id")
    private Catalog catalog;
    @Column(name = "view_name")
    private String viewName;
    @Column(name = "short_desc")
    private String shortDesc;
    private String article;
    private Double price;
    @Column(name = "old_price")
    private Double oldPrice;
    @Column(name = "in_stock")
    private Boolean inStock;

    @Override
    public Long getId() {
        return this.id;
    }
}
