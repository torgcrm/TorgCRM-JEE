package ru.torgcrm.jee.ecommerce.mappers;

import org.mapstruct.Mapper;
import ru.torgcrm.jee.ecommerce.domain.Project;
import ru.torgcrm.jee.ecommerce.dto.ProjectDTO;

/**
 * Project mapper from {@link Project} Entity
 * to {@link ProjectDTO} DTO
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Mapper(componentModel = "cdi")
public interface ProjectMapper extends EntityMapper<ProjectDTO, Project> {
}
