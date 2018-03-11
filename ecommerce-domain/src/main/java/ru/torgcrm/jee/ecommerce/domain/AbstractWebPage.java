package ru.torgcrm.jee.ecommerce.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Abstract entity for web page based entity
 * with titles, keywords and description fields
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@MappedSuperclass
public abstract class AbstractWebPage extends AbstractProjectEntity {
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    @Column(name = "meta_keywords")
    private String metaKeywords;
    @Getter
    @Setter
    @Column(name = "meta_description")
    private String metaDescription;
    @Getter
    @Setter
    private String slug;

    @Override
    public String toString() {
        return "AbstractWebPage{" +
                "title='" + title + '\'' +
                ", metaKeywords='" + metaKeywords + '\'' +
                ", metaDescription='" + metaDescription + '\'' +
                ", slug='" + slug + '\'' +
                '}';
    }
}
