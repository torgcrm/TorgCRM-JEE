package ru.torgcrm.jee.ecommerce.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Abstract entity for web page based entity
 * with titles, keywords and description fields
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
@MappedSuperclass
public abstract class AbstractWebPage extends AbstractProjectEntity {
    private String title;
    @Column(name = "meta_keywords")
    private String metaKeywords;
    @Column(name = "meta_description")
    private String metaDescription;
    private String slug;
    @Column(name = "seo_text")
    private String seoText;
}
