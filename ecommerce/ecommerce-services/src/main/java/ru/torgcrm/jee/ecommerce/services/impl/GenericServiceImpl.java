package ru.torgcrm.jee.ecommerce.services.impl;

import ru.torgcrm.jee.ecommerce.domain.GenericEntity;
import ru.torgcrm.jee.ecommerce.dto.GenericDTO;
import ru.torgcrm.jee.ecommerce.mappers.EntityMapper;
import ru.torgcrm.jee.ecommerce.repository.GenericRepository;
import ru.torgcrm.jee.ecommerce.services.GenericService;

import java.util.List;

/**
 * Generic service, contains common methods
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public abstract class GenericServiceImpl<
        D extends GenericDTO,
        R extends GenericRepository,
        M extends EntityMapper> implements GenericService<D> {
    /**
     * {@inheritDoc}
     */
    @Override
    public List findAll() {
        List list = getRepository().findAll();
        if (list != null) {
            return getMapper().toDto(list);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public D findById(Long id) {
        GenericEntity entity = getRepository().findById(id);
        if (entity != null) {
            return (D) getMapper().toDto(entity);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public D persist(D dto) {
        GenericEntity saved = getRepository().persist(getMapper().toEntity(dto));
        return (D) getMapper().toDto(saved);
    }

    /**
     * {@inheritDoc}
     */
    public D merge(D dto) {
        GenericEntity saved = getRepository().merge(getMapper().toEntity(dto));
        return (D) getMapper().toDto(saved);
    }

    /**
     * {@inheritDoc}
     */
    public void delete(Long id) {
        getRepository().delete(id);
    }

    abstract protected R getRepository();

    abstract protected M getMapper();
}
