package ru.torgcrm.jee.ecommerce.services.impl;

import ru.torgcrm.jee.ecommerce.domain.Menu;
import ru.torgcrm.jee.ecommerce.dto.MenuDTO;
import ru.torgcrm.jee.ecommerce.mappers.MenuMapper;
import ru.torgcrm.jee.ecommerce.repository.MenuRepository;
import ru.torgcrm.jee.ecommerce.services.MenuService;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Service for menu
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class MenuServiceImpl extends AbstractProjectServiceImpl<MenuDTO, MenuRepository, MenuMapper>
        implements MenuService {
    @Inject
    MenuRepository repository;
    @Inject
    MenuMapper mapper;

    /**
     * {@inheritDoc}
     */
    @Override
    public MenuDTO findByProjectIdAndCode(Long projectId, String code) {
        Menu menu = getRepository().findByProjectIdAndCode(projectId, code);
        return getMapper().toDto(menu);
    }


    @Override
    protected MenuRepository getRepository() {
        return repository;
    }

    @Override
    protected MenuMapper getMapper() {
        return mapper;
    }
}
