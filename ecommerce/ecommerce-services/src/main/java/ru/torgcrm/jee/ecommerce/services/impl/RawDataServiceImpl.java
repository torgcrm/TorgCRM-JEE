package ru.torgcrm.jee.ecommerce.services.impl;

import ru.torgcrm.jee.ecommerce.dto.RawDataDTO;
import ru.torgcrm.jee.ecommerce.mappers.RawDataMapper;
import ru.torgcrm.jee.ecommerce.repository.RawDataRepository;
import ru.torgcrm.jee.ecommerce.services.RawDataService;

import javax.ejb.Stateless;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class RawDataServiceImpl extends GenericServiceImpl<RawDataDTO, RawDataRepository, RawDataMapper>
        implements RawDataService {
    @Override
    protected RawDataRepository getRepository() {
        return null;
    }

    @Override
    protected RawDataMapper getMapper() {
        return null;
    }
}
