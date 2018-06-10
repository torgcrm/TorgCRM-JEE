package ru.torgcrm.jee.ecommerce.services.impl;

import ru.torgcrm.jee.ecommerce.dto.CatalogDTO;
import ru.torgcrm.jee.ecommerce.mappers.CatalogMapper;
import ru.torgcrm.jee.ecommerce.repository.CatalogRepository;
import ru.torgcrm.jee.ecommerce.services.CatalogService;

import javax.ejb.Stateless;

/**
 * Service for {@link CatalogRepository}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class CatalogServiceImpl extends GenericServiceImpl<CatalogDTO, CatalogRepository, CatalogMapper>
        implements CatalogService {
}
