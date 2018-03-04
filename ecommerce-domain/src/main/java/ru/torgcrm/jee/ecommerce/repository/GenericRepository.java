package ru.torgcrm.jee.ecommerce.repository;

import ru.torgcrm.jee.ecommerce.domain.GenericEntity;

import java.util.List;

/**
 * Generic CRUD Repository
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public interface GenericRepository<T extends GenericEntity> {
    /**
     * Find all entities in database
     *
     * @return List of entities
     */
    List<T> findAll();

    /**
     * Find entity by unique id
     *
     * @return entity
     */
    T findById();

    /**
     * Save or update entity in database
     *
     * @param entity {@link GenericEntity} some entity class
     * @return updated entity with id
     */
    T save(T entity);

    /**
     * Delete entity by object
     *
     * @param entity {@link GenericEntity}
     */
    void delete(T entity);

    /**
     * Delete entity by id;
     *
     * @param id Long unique ID
     */
    void delete(Long id);
}
