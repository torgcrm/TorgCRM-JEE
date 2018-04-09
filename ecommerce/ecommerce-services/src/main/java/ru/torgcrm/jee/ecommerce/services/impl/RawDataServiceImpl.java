package ru.torgcrm.jee.ecommerce.services.impl;

import ru.torgcrm.jee.ecommerce.dto.RawDataDTO;
import ru.torgcrm.jee.ecommerce.mappers.RawDataMapper;
import ru.torgcrm.jee.ecommerce.repository.RawDataRepository;

import javax.ejb.Stateless;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class RawDataServiceImpl extends
        GenericServiceImpl<RawDataDTO, RawDataRepository, RawDataMapper> {
}
