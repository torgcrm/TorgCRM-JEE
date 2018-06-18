package ru.torgcrm.jee.ecommerce.services.impl;

import ru.torgcrm.jee.ecommerce.domain.GenericEntity;
import ru.torgcrm.jee.ecommerce.dto.AbstractWebPageDTO;
import ru.torgcrm.jee.ecommerce.dto.GenericDTO;
import ru.torgcrm.jee.ecommerce.mappers.EntityMapper;
import ru.torgcrm.jee.ecommerce.repository.AbstractWebPageRepository;
import ru.torgcrm.jee.ecommerce.services.AbstractWebPageService;

/**
 * Abstract service for entities with slug
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public abstract class AbstractWebPageServiceImpl<
        D extends AbstractWebPageDTO,
        R extends AbstractWebPageRepository,
        M extends EntityMapper> extends AbstractProjectServiceImpl<D, R, M> implements AbstractWebPageService<D> {
    /**
     * {@inheritDoc}
     */
    @Override
    public D findBySlugAndProjectId(String slug, Long projectId) {
        GenericEntity product = getRepository().findBySlugAndProjectId(slug, projectId);
        if (product != null) {
            return (D) getMapper().toDto(product);
        }
        return null;
    }
}
