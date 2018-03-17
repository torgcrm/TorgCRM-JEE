package ru.torgcrm.jee.ecommerce.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * DTO for catalog {@link ru.torgcrm.jee.ecommerce.domain.Catalog}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CatalogDTO extends AbstractWebPageDTO {
}
