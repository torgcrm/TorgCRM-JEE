package ru.torgcrm.jee.ecommerce.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Menu item DTO
 * see also {@link ru.torgcrm.jee.ecommerce.domain.MenuItem}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@NoArgsConstructor
public class MenuItemDTO extends AbstractProjectDTO {
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String code;
    @Getter
    @Setter
    private String link;
}
