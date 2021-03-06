package ru.torgcrm.jee.ecommerce.services.impl;

import ru.torgcrm.jee.ecommerce.domain.Project;
import ru.torgcrm.jee.ecommerce.dto.ProjectDTO;
import ru.torgcrm.jee.ecommerce.mappers.ProjectMapper;
import ru.torgcrm.jee.ecommerce.repository.ProjectRepository;
import ru.torgcrm.jee.ecommerce.services.ProjectService;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * implementation of Project service {@link ProjectService}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class ProjectServiceImpl
        extends GenericServiceImpl<ProjectDTO, ProjectRepository, ProjectMapper> implements ProjectService {
    @Inject
    private ProjectRepository projectRepository;
    @Inject
    private ProjectMapper projectMapper;

    /**
     * Find only one (first in list) project by host
     *
     * @param host host, e.g. custom header Project-Host
     * @return first project in list, or null if not find
     */
    @Override
    public ProjectDTO findOneByHost(String host) {
        List<Project> projects = projectRepository.findByHost(host);
        if (projects != null && projects.size() > 0) {
            return projectMapper.toDto(projects.get(0));
        }
        return null;
    }


    @Override
    protected ProjectRepository getRepository() {
        return projectRepository;
    }

    @Override
    protected ProjectMapper getMapper() {
        return projectMapper;
    }
}
