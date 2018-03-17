package ru.torgcrm.jee.ecommerce.services.impl;

import ru.torgcrm.jee.ecommerce.dto.PageDTO;
import ru.torgcrm.jee.ecommerce.mappers.PageMapper;
import ru.torgcrm.jee.ecommerce.repository.PageRepository;
import ru.torgcrm.jee.ecommerce.services.IPageService;

import javax.ejb.Stateless;

/**
 * Implementation of page service {@link IPageService}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class PageServiceImpl extends AbstractWebPageServiceImpl<PageDTO, PageRepository, PageMapper>
        implements IPageService {
}
