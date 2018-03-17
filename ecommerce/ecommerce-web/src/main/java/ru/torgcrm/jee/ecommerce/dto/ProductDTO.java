package ru.torgcrm.jee.ecommerce.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Product DTO class {@link ru.torgcrm.jee.ecommerce.domain.Product}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class ProductDTO extends AbstractWebPageDTO {
    private CatalogDTO catalog;
    private String viewName;
    private String shortDesc;
    private String article;
    private Double price;
    private Double oldPrice;
    private String seoText;
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
