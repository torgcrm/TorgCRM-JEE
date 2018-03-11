package ru.torgcrm.jee.ecommerce.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("view_name")
    private String viewName;
    @Getter
    @Setter
    @JsonProperty("short_desc")
    private String shortDesc;
    @Getter
    @Setter
    private String article;
    @Getter
    @Setter
    private Double price;
    @Getter
    @Setter
    @JsonProperty("old_price")
    private Double oldPrice;
    @Getter
    @Setter
    @JsonProperty("seo_text")
    private String seoText;
    @Getter
    @Setter
    @JsonProperty("in_stock")
    private Boolean inStock;
}
