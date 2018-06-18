package ru.torgcrm.jee.ecommerce.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Menu item DTO.
 * see also {@link ru.torgcrm.jee.ecommerce.domain.MenuItem}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class MenuItemDTO extends AbstractWebPageDTO {
    private String name;
    private String code;
    private String link;
    private MenuDTO menu;
}
