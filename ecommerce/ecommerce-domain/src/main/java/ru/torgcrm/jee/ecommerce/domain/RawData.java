package ru.torgcrm.jee.ecommerce.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Data
@Entity
@Table(name = "raw_data")
public class RawData extends GenericEntity {
    public static final String GEN_NAME = "Gen_Raw_Data";
    public static final String SEQ_NAME = "Seq_Raw_Data";

    @Id
    @SequenceGenerator(sequenceName = SEQ_NAME, name = GEN_NAME)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GEN_NAME)
    private Long id;
}
