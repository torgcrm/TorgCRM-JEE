package ru.torgcrm.jee.ecommerce.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "customers")
public class Customer extends AbstractProjectEntity {
    public static final String GEN_NAME = "Gen_Customers";
    public static final String SEQ_NAME = "Seq_Customers";

    @Id
    @SequenceGenerator(sequenceName = SEQ_NAME, name = GEN_NAME)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GEN_NAME)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "second_name")
    private String secondName;
    @Column(name = "birth_date")
    private Date birthDate;
    @Column(name = "comments")
    private String comments;
    @Column(name = "full_name")
    private String fullName;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "orders_customers",
            joinColumns = {@JoinColumn(name = "customer_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "order_id", referencedColumnName = "id")}
    )
    private List<Order> orders;
}
