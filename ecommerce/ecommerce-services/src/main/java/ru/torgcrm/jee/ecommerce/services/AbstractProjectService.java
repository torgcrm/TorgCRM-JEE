package ru.torgcrm.jee.ecommerce.services;

import ru.torgcrm.jee.ecommerce.dto.AbstractProjectDTO;
import ru.torgcrm.jee.ecommerce.dto.GenericDTO;

import java.util.List;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public interface AbstractProjectService<D extends AbstractProjectDTO> extends GenericService<D> {
    /**
     * Find all products by project id {@link ru.torgcrm.jee.ecommerce.domain.Project}
     *
     * @param projectId project id
     * @return {@link GenericDTO}
     */
    List<D> findAllByProjectId(Long projectId);
}
