package ru.torgcrm.jee.ecommerce.mappers;

import ru.torgcrm.jee.ecommerce.domain.Menu;
import ru.torgcrm.jee.ecommerce.domain.MenuItem;
import ru.torgcrm.jee.ecommerce.domain.Project;
import ru.torgcrm.jee.ecommerce.dto.MenuDTO;
import ru.torgcrm.jee.ecommerce.dto.MenuItemDTO;
import ru.torgcrm.jee.ecommerce.dto.ProjectDTO;

import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-03-22T23:34:51+0300",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_161 (Oracle Corporation)"
)
@ApplicationScoped
public class MenuMapperImpl implements MenuMapper {

    @Override
    public Menu toEntity(MenuDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Menu menu = new Menu();

        menu.setProject( projectDTOToProject( dto.getProject() ) );
        menu.setId( dto.getId() );
        menu.setName( dto.getName() );
        menu.setCode( dto.getCode() );
        menu.setMenuItems( menuItemDTOListToMenuItemList( dto.getMenuItems() ) );

        return menu;
    }

    @Override
    public MenuDTO toDto(Menu entity) {
        if ( entity == null ) {
            return null;
        }

        MenuDTO menuDTO = new MenuDTO();

        menuDTO.setId( entity.getId() );
        menuDTO.setProject( projectToProjectDTO( entity.getProject() ) );
        menuDTO.setName( entity.getName() );
        menuDTO.setCode( entity.getCode() );
        menuDTO.setMenuItems( menuItemListToMenuItemDTOList( entity.getMenuItems() ) );

        return menuDTO;
    }

    @Override
    public List<Menu> toEntity(List<MenuDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Menu> list = new ArrayList<Menu>( dtoList.size() );
        for ( MenuDTO menuDTO : dtoList ) {
            list.add( toEntity( menuDTO ) );
        }

        return list;
    }

    @Override
    public List<MenuDTO> toDto(List<Menu> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<MenuDTO> list = new ArrayList<MenuDTO>( entityList.size() );
        for ( Menu menu : entityList ) {
            list.add( toDto( menu ) );
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

    protected MenuItem menuItemDTOToMenuItem(MenuItemDTO menuItemDTO) {
        if ( menuItemDTO == null ) {
            return null;
        }

        MenuItem menuItem = new MenuItem();

        menuItem.setProject( projectDTOToProject( menuItemDTO.getProject() ) );
        menuItem.setId( menuItemDTO.getId() );
        menuItem.setCode( menuItemDTO.getCode() );
        menuItem.setLink( menuItemDTO.getLink() );
        menuItem.setName( menuItemDTO.getName() );

        return menuItem;
    }

    protected List<MenuItem> menuItemDTOListToMenuItemList(List<MenuItemDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<MenuItem> list1 = new ArrayList<MenuItem>( list.size() );
        for ( MenuItemDTO menuItemDTO : list ) {
            list1.add( menuItemDTOToMenuItem( menuItemDTO ) );
        }

        return list1;
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

    protected MenuItemDTO menuItemToMenuItemDTO(MenuItem menuItem) {
        if ( menuItem == null ) {
            return null;
        }

        MenuItemDTO menuItemDTO = new MenuItemDTO();

        menuItemDTO.setId( menuItem.getId() );
        menuItemDTO.setProject( projectToProjectDTO( menuItem.getProject() ) );
        menuItemDTO.setName( menuItem.getName() );
        menuItemDTO.setCode( menuItem.getCode() );
        menuItemDTO.setLink( menuItem.getLink() );

        return menuItemDTO;
    }

    protected List<MenuItemDTO> menuItemListToMenuItemDTOList(List<MenuItem> list) {
        if ( list == null ) {
            return null;
        }

        List<MenuItemDTO> list1 = new ArrayList<MenuItemDTO>( list.size() );
        for ( MenuItem menuItem : list ) {
            list1.add( menuItemToMenuItemDTO( menuItem ) );
        }

        return list1;
    }
}
