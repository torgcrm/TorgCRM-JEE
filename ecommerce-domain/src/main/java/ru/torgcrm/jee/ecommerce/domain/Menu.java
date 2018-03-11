package ru.torgcrm.jee.ecommerce.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Website menu, for example top menu, footer menu, etc...
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Entity
@Table(name = "menu")
@NamedQueries({
        @NamedQuery(name = Menu.FIND_BY_PROJECT_AND_CODE,
                query = "select m from Menu m where m.project.id=:projectId and m.code=:code")
})
public class Menu extends AbstractProjectEntity {
    public static final String GEN_NAME = "Gen_Menu";
    public static final String SEQ_NAME = "Seq_Menu";
    public static final String FIND_BY_PROJECT_AND_CODE = "FIND_BY_PROJECT_AND_CODE";

    @Id
    @SequenceGenerator(sequenceName = SEQ_NAME, name = GEN_NAME)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GEN_NAME)
    private Long id;

    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String code;
    @Getter
    @Setter
    @OneToMany(mappedBy = "menu", fetch = FetchType.LAZY)
    List<MenuItem> menuItems;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", menuItems=" + menuItems +
                '}';
    }
}
