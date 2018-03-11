package ru.torgcrm.jee.ecommerce.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * E-Commerce project, e.g. website
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Entity
@Table(name = "projects")
@NamedQuery(name = Project.FIND_PROJECT_BY_HOST,
        query = "select p from Project p where p.host=:host")
public class Project extends GenericEntity {
    public static final String GEN_NAME = "Gen_Projects";
    public static final String SEQ_NAME = "Seq_Projects";
    public static final String FIND_PROJECT_BY_HOST = "FIND_PROJECT_BY_HOST";

    @Id
    @SequenceGenerator(sequenceName = SEQ_NAME, name = GEN_NAME)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GEN_NAME)
    private Long id;
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private String code;
    @Getter
    @Setter
    private String host;
    @Getter
    @Setter
    @Column(name = "meta_description")
    private String metaDescription;
    @Getter
    @Setter
    @Column(name = "meta_keywords")
    private String metaKeywords;
    @Getter
    @Setter
    @Column(name = "phone_number")
    private String phone;
    @Getter
    @Setter
    @Lob
    private String logo;

    @Override
    public Long getId() {
        return this.id;
    }


}
