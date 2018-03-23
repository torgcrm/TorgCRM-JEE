package ru.torgcrm.jee.ecommerce.mappers;

import ru.torgcrm.jee.ecommerce.domain.MenuItem;
import ru.torgcrm.jee.ecommerce.domain.Project;
import ru.torgcrm.jee.ecommerce.dto.MenuItemDTO;
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
public class MenuItemMapperImpl implements MenuItemMapper {

    @Override
    public MenuItem toEntity(MenuItemDTO dto) {
        if ( dto == null ) {
            return null;
        }

        MenuItem menuItem = new MenuItem();

        menuItem.setProject( projectDTOToProject( dto.getProject() ) );
        menuItem.setId( dto.getId() );
        menuItem.setCode( dto.getCode() );
        menuItem.setLink( dto.getLink() );
        menuItem.setName( dto.getName() );

        return menuItem;
    }

    @Override
    public MenuItemDTO toDto(MenuItem entity) {
        if ( entity == null ) {
            return null;
        }

        MenuItemDTO menuItemDTO = new MenuItemDTO();

        menuItemDTO.setId( entity.getId() );
        menuItemDTO.setProject( projectToProjectDTO( entity.getProject() ) );
        menuItemDTO.setName( entity.getName() );
        menuItemDTO.setCode( entity.getCode() );
        menuItemDTO.setLink( entity.getLink() );

        return menuItemDTO;
    }

    @Override
    public List<MenuItem> toEntity(List<MenuItemDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<MenuItem> list = new ArrayList<MenuItem>( dtoList.size() );
        for ( MenuItemDTO menuItemDTO : dtoList ) {
            list.add( toEntity( menuItemDTO ) );
        }

        return list;
    }

    @Override
    public List<MenuItemDTO> toDto(List<MenuItem> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<MenuItemDTO> list = new ArrayList<MenuItemDTO>( entityList.size() );
        for ( MenuItem menuItem : entityList ) {
            list.add( toDto( menuItem ) );
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
