package ru.torgcrm.jee.ecommerce.services;

import ru.torgcrm.jee.ecommerce.dto.ProjectDTO;

/**
 * Service for project
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 * @see ru.torgcrm.jee.ecommerce.dto.ProjectDTO
 */
public interface ProjectService {
    ProjectDTO findOneByHost(String host);
}
