package ru.torgcrm.jee.ecommerce.services.impl;

import ru.torgcrm.jee.ecommerce.dto.CatalogDTO;
import ru.torgcrm.jee.ecommerce.mappers.CatalogMapper;
import ru.torgcrm.jee.ecommerce.repository.CatalogRepository;
import ru.torgcrm.jee.ecommerce.services.ICatalogService;

import javax.ejb.Stateless;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class CatalogService extends GenericService<CatalogDTO, CatalogRepository, CatalogMapper>
        implements ICatalogService {
}
