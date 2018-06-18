package ru.torgcrm.jee.ecommerce.services;

import ru.torgcrm.jee.ecommerce.dto.PageDTO;
import ru.torgcrm.jee.ecommerce.utils.generators.OrderGenerator;
import ru.torgcrm.jee.ecommerce.utils.generators.PageGenerator;

import javax.inject.Inject;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public class PageServiceTest extends AbstractWebPageServiceTest
        <PageDTO, PageService, PageGenerator> {

    @Inject
    PageService service;
    @Inject
    PageGenerator generator;

    @Override
    protected PageService getService() {
        return service;
    }

    @Override
    protected PageGenerator getGenerator() {
        return generator;
    }
}
