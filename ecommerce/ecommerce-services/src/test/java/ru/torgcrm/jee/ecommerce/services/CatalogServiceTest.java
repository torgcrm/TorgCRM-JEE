package ru.torgcrm.jee.ecommerce.services;

import ru.torgcrm.jee.ecommerce.dto.CatalogDTO;
import ru.torgcrm.jee.ecommerce.utils.generators.CatalogGenerator;

import javax.inject.Inject;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public class CatalogServiceTest extends AbstractWebPageServiceTest
        <CatalogDTO, CatalogService, CatalogGenerator> {

    @Inject
    CatalogService service;
    @Inject
    CatalogGenerator generator;

    @Override
    protected CatalogService getService() {
        return service;
    }

    @Override
    protected CatalogGenerator getGenerator() {
        return generator;
    }
}
