package ru.torgcrm.jee.ecommerce.services.impl;

import ru.torgcrm.jee.ecommerce.dto.CatalogDTO;
import ru.torgcrm.jee.ecommerce.mappers.CatalogMapper;
import ru.torgcrm.jee.ecommerce.repository.CatalogRepository;
import ru.torgcrm.jee.ecommerce.services.CatalogService;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Service for {@link CatalogRepository}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class CatalogServiceImpl extends AbstractWebPageServiceImpl<CatalogDTO, CatalogRepository, CatalogMapper>
        implements CatalogService {

    @Inject
    CatalogRepository repository;
    @Inject
    CatalogMapper mapper;

    @Override
    protected CatalogRepository getRepository() {
        return repository;
    }

    @Override
    protected CatalogMapper getMapper() {
        return mapper;
    }
}
