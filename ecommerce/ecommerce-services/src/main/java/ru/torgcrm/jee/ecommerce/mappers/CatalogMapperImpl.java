package ru.torgcrm.jee.ecommerce.mappers;

import ru.torgcrm.jee.ecommerce.domain.Catalog;
import ru.torgcrm.jee.ecommerce.domain.Project;
import ru.torgcrm.jee.ecommerce.dto.CatalogDTO;
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
public class CatalogMapperImpl implements CatalogMapper {

    @Override
    public Catalog toEntity(CatalogDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Catalog catalog = new Catalog();

        catalog.setProject( projectDTOToProject( dto.getProject() ) );
        catalog.setTitle( dto.getTitle() );
        catalog.setSlug( dto.getSlug() );
        catalog.setId( dto.getId() );

        return catalog;
    }

    @Override
    public CatalogDTO toDto(Catalog entity) {
        if ( entity == null ) {
            return null;
        }

        CatalogDTO catalogDTO = new CatalogDTO();

        catalogDTO.setId( entity.getId() );
        catalogDTO.setProject( projectToProjectDTO( entity.getProject() ) );
        catalogDTO.setTitle( entity.getTitle() );
        catalogDTO.setSlug( entity.getSlug() );

        return catalogDTO;
    }

    @Override
    public List<Catalog> toEntity(List<CatalogDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Catalog> list = new ArrayList<Catalog>( dtoList.size() );
        for ( CatalogDTO catalogDTO : dtoList ) {
            list.add( toEntity( catalogDTO ) );
        }

        return list;
    }

    @Override
    public List<CatalogDTO> toDto(List<Catalog> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CatalogDTO> list = new ArrayList<CatalogDTO>( entityList.size() );
        for ( Catalog catalog : entityList ) {
            list.add( toDto( catalog ) );
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
