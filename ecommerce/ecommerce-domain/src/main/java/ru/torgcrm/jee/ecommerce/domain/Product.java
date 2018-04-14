package ru.torgcrm.jee.ecommerce.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = Product.GEN_NAME)
    @SequenceGenerator(sequenceName = SEQ_NAME, name = Product.GEN_NAME, allocationSize = 1)
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
    private Boolean draft;
    @OneToMany
    @JoinTable(name = "raw_data_products",
            joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "raw_data_id", referencedColumnName = "id")
    )
    private List<RawData> rawData;

    @Override
    public Long getId() {
        return this.id;
    }
}
