package ru.torgcrm.jee.ecommerce.mappers;

import ru.torgcrm.jee.ecommerce.domain.Project;
import ru.torgcrm.jee.ecommerce.dto.ProjectDTO;

import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-03-22T23:34:52+0300",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_161 (Oracle Corporation)"
)
@ApplicationScoped
public class ProjectMapperImpl implements ProjectMapper {

    @Override
    public Project toEntity(ProjectDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Project project = new Project();

        project.setId( dto.getId() );
        project.setTitle( dto.getTitle() );
        project.setCode( dto.getCode() );
        project.setHost( dto.getHost() );
        project.setMetaDescription( dto.getMetaDescription() );
        project.setMetaKeywords( dto.getMetaKeywords() );
        project.setPhone( dto.getPhone() );
        project.setLogo( dto.getLogo() );

        return project;
    }

    @Override
    public ProjectDTO toDto(Project entity) {
        if ( entity == null ) {
            return null;
        }

        ProjectDTO projectDTO = new ProjectDTO();

        projectDTO.setId( entity.getId() );
        projectDTO.setTitle( entity.getTitle() );
        projectDTO.setCode( entity.getCode() );
        projectDTO.setHost( entity.getHost() );
        projectDTO.setMetaDescription( entity.getMetaDescription() );
        projectDTO.setMetaKeywords( entity.getMetaKeywords() );
        projectDTO.setPhone( entity.getPhone() );
        projectDTO.setLogo( entity.getLogo() );

        return projectDTO;
    }

    @Override
    public List<Project> toEntity(List<ProjectDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Project> list = new ArrayList<Project>( dtoList.size() );
        for ( ProjectDTO projectDTO : dtoList ) {
            list.add( toEntity( projectDTO ) );
        }

        return list;
    }

    @Override
    public List<ProjectDTO> toDto(List<Project> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ProjectDTO> list = new ArrayList<ProjectDTO>( entityList.size() );
        for ( Project project : entityList ) {
            list.add( toDto( project ) );
        }

        return list;
    }
}
