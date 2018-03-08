package ru.torgcrm.jee.ecommerce.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Menu DTO, eg top menu, footer menu, etc...
 * see also {@link ru.torgcrm.jee.ecommerce.domain.Menu}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@NoArgsConstructor
public class MenuDTO extends AbstractProjectDTO {
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String code;
    @Getter
    @Setter
    List<MenuItemDTO> menuItems;
}
