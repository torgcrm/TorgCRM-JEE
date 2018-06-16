package ru.torgcrm.jee.ecommerce.utils.generators;

import ru.torgcrm.jee.ecommerce.domain.Project;
import ru.torgcrm.jee.ecommerce.dto.ProjectDTO;

import javax.ejb.Stateless;

/**
 * Project generator.
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class ProjectGenerator extends AbstractGenerator<Project, ProjectDTO> {
    @Override
    public Project createEntity() {
        Project project = new Project();
        project.setCode(dataFactory.getRandomWord(50));
        project.setTitle(dataFactory.getRandomWord(50));
        project.setHost(dataFactory.getRandomWord(50));
        project.setLogo(dataFactory.getRandomWord(50));
        project.setMetaDescription(dataFactory.getRandomText(100));
        project.setMetaKeywords(dataFactory.getRandomWord());
        project.setPhone(dataFactory.getNumberText(10));
        return project;
    }

    @Override
    public ProjectDTO createDto() {
        ProjectDTO projectDTO = new ProjectDTO();
        projectDTO.setCode(dataFactory.getRandomWord(50));
        projectDTO.setTitle(dataFactory.getRandomWord(50));
        projectDTO.setHost(dataFactory.getRandomWord(50));
        projectDTO.setLogo(dataFactory.getRandomWord(50));
        projectDTO.setMetaDescription(dataFactory.getRandomText(100));
        projectDTO.setMetaKeywords(dataFactory.getRandomWord(50));
        projectDTO.setPhone(dataFactory.getNumberText(10));
        return projectDTO;
    }
}
