package ru.torgcrm.jee.ecommerce.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Product DTO class {@link ru.torgcrm.jee.ecommerce.domain.Product}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@NoArgsConstructor
public class ProductDTO extends AbstractWebPageDTO {
    @Getter
    @Setter
    private CatalogDTO catalog;
    @Getter
    @Setter
    private String viewName;
    @Getter
    @Setter
    private String shortDesc;
    @Getter
    @Setter
    private String article;
    @Getter
    @Setter
    private Double price;
    @Getter
    @Setter
    private Double oldPrice;
    @Getter
    @Setter
    private String seoText;
    @Getter
    @Setter
    private Boolean inStock;

    @Override
    public String toString() {
        return "ProductDTO{" +
                "catalog=" + catalog +
                ", viewName='" + viewName + '\'' +
                ", shortDesc='" + shortDesc + '\'' +
                ", article='" + article + '\'' +
                ", price=" + price +
                ", oldPrice=" + oldPrice +
                ", seoText='" + seoText + '\'' +
                ", inStock=" + inStock +
                '}';
    }
}
