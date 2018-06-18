package ru.torgcrm.jee.ecommerce.services.impl;

import ru.torgcrm.jee.ecommerce.dto.PageDTO;
import ru.torgcrm.jee.ecommerce.mappers.PageMapper;
import ru.torgcrm.jee.ecommerce.repository.PageRepository;
import ru.torgcrm.jee.ecommerce.services.PageService;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Implementation of page service {@link PageService}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class PageServiceImpl extends AbstractWebPageServiceImpl<PageDTO, PageRepository, PageMapper>
        implements PageService {
    @Inject
    PageRepository repository;
    @Inject
    PageMapper mapper;

    @Override
    protected PageRepository getRepository() {
        return repository;
    }

    @Override
    protected PageMapper getMapper() {
        return mapper;
    }
}
