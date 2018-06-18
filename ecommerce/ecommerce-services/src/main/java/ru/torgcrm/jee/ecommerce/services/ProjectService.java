package ru.torgcrm.jee.ecommerce.services;

import ru.torgcrm.jee.ecommerce.dto.ProjectDTO;

/**
 * Service for project
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 * @see ru.torgcrm.jee.ecommerce.dto.ProjectDTO
 */
public interface ProjectService extends GenericService<ProjectDTO> {
    ProjectDTO findOneByHost(String host);
}
