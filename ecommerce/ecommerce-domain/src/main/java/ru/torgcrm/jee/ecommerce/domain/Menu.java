package ru.torgcrm.jee.ecommerce.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

/**
 * Website menu, for example top menu, footer menu, etc...
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
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
    @SequenceGenerator(sequenceName = SEQ_NAME, name = GEN_NAME, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GEN_NAME)
    private Long id;
    private String name;
    private String code;
    @OneToMany(mappedBy = "menu", fetch = FetchType.LAZY)
    List<MenuItem> menuItems;

    @Override
    public Long getId() {
        return this.id;
    }
}
