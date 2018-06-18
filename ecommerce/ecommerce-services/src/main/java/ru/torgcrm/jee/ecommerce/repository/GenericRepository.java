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
    T findById(Long id);

    /**
     * Save or update entity in database.
     *
     * @param entity {@link GenericEntity} some entity class
     * @return updated entity with id
     */
    T persist(T entity);

    /**
     * Merge object.
     * <p>
     * Find an attached object with the same id and update it.
     * If exists update and return the already attached object.
     * If doesn't exist insert the new register to the database.
     *
     * @param entity {@link GenericEntity} som entity class
     * @return merged entity
     */
    T merge(T entity);

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

    /**
     * Get entity from entity manager context.
     *
     * @param id entity id.
     * @return {@link GenericEntity} abstract entity.
     * @throws ClassNotFoundException
     */
    T getReference(Long id);
}
