package ru.torgcrm.jee.ecommerce.services.impl;

import ru.torgcrm.jee.ecommerce.dto.AbstractProjectDTO;
import ru.torgcrm.jee.ecommerce.mappers.EntityMapper;
import ru.torgcrm.jee.ecommerce.repository.AbstractProjectRepository;
import ru.torgcrm.jee.ecommerce.services.AbstractProjectService;

import java.util.List;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public abstract class AbstractProjectServiceImpl<D extends AbstractProjectDTO, R extends AbstractProjectRepository, M extends EntityMapper>
        extends GenericServiceImpl<D, R, M> implements AbstractProjectService<D> {

    /**
     * {@inheritDoc}
     */
    @Override
    public List findAllByProjectId(Long projectId) {
        List list = getRepository().findAllByProjectId(projectId);
        if (list != null) {
            return getMapper().toDto(list);
        }
        return null;
    }
}
