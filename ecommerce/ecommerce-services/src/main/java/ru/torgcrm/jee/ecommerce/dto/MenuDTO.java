package ru.torgcrm.jee.ecommerce.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Menu DTO, eg top menu, footer menu, etc...
 * see also {@link ru.torgcrm.jee.ecommerce.domain.Menu}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class MenuDTO extends AbstractProjectDTO {
    private String name;
    private String code;
    List<MenuItemDTO> menuItems;
}
