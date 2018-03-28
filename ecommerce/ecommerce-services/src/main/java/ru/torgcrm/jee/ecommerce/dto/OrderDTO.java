package ru.torgcrm.jee.ecommerce.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * DTO for orders
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class OrderDTO extends AbstractProjectDTO {
    private String phone;
    private String processId;
    private Long productId;
    private List<ProductDTO> products;
    private String comment;
}
