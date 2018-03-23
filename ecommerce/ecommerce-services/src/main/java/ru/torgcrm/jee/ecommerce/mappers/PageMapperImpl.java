package ru.torgcrm.jee.ecommerce.mappers;

import ru.torgcrm.jee.ecommerce.domain.Page;
import ru.torgcrm.jee.ecommerce.domain.Project;
import ru.torgcrm.jee.ecommerce.dto.PageDTO;
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
public class PageMapperImpl implements PageMapper {

    @Override
    public Page toEntity(PageDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Page page = new Page();

        page.setProject( projectDTOToProject( dto.getProject() ) );
        page.setTitle( dto.getTitle() );
        page.setSlug( dto.getSlug() );
        page.setId( dto.getId() );

        return page;
    }

    @Override
    public PageDTO toDto(Page entity) {
        if ( entity == null ) {
            return null;
        }

        PageDTO pageDTO = new PageDTO();

        pageDTO.setId( entity.getId() );
        pageDTO.setProject( projectToProjectDTO( entity.getProject() ) );
        pageDTO.setTitle( entity.getTitle() );
        pageDTO.setSlug( entity.getSlug() );

        return pageDTO;
    }

    @Override
    public List<Page> toEntity(List<PageDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Page> list = new ArrayList<Page>( dtoList.size() );
        for ( PageDTO pageDTO : dtoList ) {
            list.add( toEntity( pageDTO ) );
        }

        return list;
    }

    @Override
    public List<PageDTO> toDto(List<Page> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PageDTO> list = new ArrayList<PageDTO>( entityList.size() );
        for ( Page page : entityList ) {
            list.add( toDto( page ) );
        }

        return list;
    }

    protected Project projectDTOToProject(ProjectDTO projectDTO) {
        if ( projectDTO == null ) {
            return null;
        }

        Project project = new Project();

        project.setId( projectDTO.getId() );
        project.setTitle( projectDTO.getTitle() );
        project.setCode( projectDTO.getCode() );
        project.setHost( projectDTO.getHost() );
        project.setMetaDescription( projectDTO.getMetaDescription() );
        project.setMetaKeywords( projectDTO.getMetaKeywords() );
        project.setPhone( projectDTO.getPhone() );
        project.setLogo( projectDTO.getLogo() );

        return project;
    }

    protected ProjectDTO projectToProjectDTO(Project project) {
        if ( project == null ) {
            return null;
        }

        ProjectDTO projectDTO = new ProjectDTO();

        projectDTO.setId( project.getId() );
        projectDTO.setTitle( project.getTitle() );
        projectDTO.setCode( project.getCode() );
        projectDTO.setHost( project.getHost() );
        projectDTO.setMetaDescription( project.getMetaDescription() );
        projectDTO.setMetaKeywords( project.getMetaKeywords() );
        projectDTO.setPhone( project.getPhone() );
        projectDTO.setLogo( project.getLogo() );

        return projectDTO;
    }
}
