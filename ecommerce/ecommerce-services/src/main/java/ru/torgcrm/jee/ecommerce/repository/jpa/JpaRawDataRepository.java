package ru.torgcrm.jee.ecommerce.repository.jpa;

import ru.torgcrm.jee.ecommerce.domain.RawData;
import ru.torgcrm.jee.ecommerce.repository.RawDataRepository;

import javax.enterprise.context.ApplicationScoped;

/**
 * Implementation of {@link RawDataRepository}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@ApplicationScoped
public class JpaRawDataRepository extends JpaGenericRepository<RawData> implements
        RawDataRepository {
}
