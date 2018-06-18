package ru.torgcrm.jee.ecommerce.services;

import ru.torgcrm.jee.ecommerce.dto.GenericDTO;

import java.util.List;

/**
 * Generic Service
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public interface GenericService<D extends GenericDTO> {
    /**
     * Get all products
     *
     * @return {@link GenericDTO}
     */
    List<D> findAll();

    /**
     * Find by product id
     *
     * @param id product id
     * @return {@link GenericDTO}
     */
    D findById(Long id);

    /**
     * Save entity to database
     *
     * @param dto DTO
     */
    D persist(D dto);

    /**
     * Merge dto to database
     * @return
     */
    D merge(D dto);

    /**
     * Delete entity by id
     *
     * @param id entity id
     */
    void delete(Long id);
}
