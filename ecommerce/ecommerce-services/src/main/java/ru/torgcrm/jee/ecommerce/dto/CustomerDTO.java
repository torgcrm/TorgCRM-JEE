package ru.torgcrm.jee.ecommerce.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * DTO for customer
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class CustomerDTO extends AbstractProjectDTO {
    private String firstName;
    private String lastName;
    private String secondName;
    private Date birthDate;
    private String comments;
    private String fullName;
}
