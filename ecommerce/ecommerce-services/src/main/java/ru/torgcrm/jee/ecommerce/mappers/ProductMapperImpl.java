package ru.torgcrm.jee.ecommerce.mappers;

import ru.torgcrm.jee.ecommerce.domain.Catalog;
import ru.torgcrm.jee.ecommerce.domain.Product;
import ru.torgcrm.jee.ecommerce.domain.Project;
import ru.torgcrm.jee.ecommerce.dto.CatalogDTO;
import ru.torgcrm.jee.ecommerce.dto.ProductDTO;
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
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product toEntity(ProductDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Product product = new Product();

        product.setProject( projectDTOToProject( dto.getProject() ) );
        product.setTitle( dto.getTitle() );
        product.setSlug( dto.getSlug() );
        product.setSeoText( dto.getSeoText() );
        product.setId( dto.getId() );
        product.setCatalog( catalogDTOToCatalog( dto.getCatalog() ) );
        product.setViewName( dto.getViewName() );
        product.setShortDesc( dto.getShortDesc() );
        product.setArticle( dto.getArticle() );
        product.setPrice( dto.getPrice() );
        product.setOldPrice( dto.getOldPrice() );
        product.setInStock( dto.getInStock() );

        return product;
    }

    @Override
    public ProductDTO toDto(Product entity) {
        if ( entity == null ) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();

        productDTO.setId( entity.getId() );
        productDTO.setProject( projectToProjectDTO( entity.getProject() ) );
        productDTO.setTitle( entity.getTitle() );
        productDTO.setSlug( entity.getSlug() );
        productDTO.setCatalog( catalogToCatalogDTO( entity.getCatalog() ) );
        productDTO.setViewName( entity.getViewName() );
        productDTO.setShortDesc( entity.getShortDesc() );
        productDTO.setArticle( entity.getArticle() );
        productDTO.setPrice( entity.getPrice() );
        productDTO.setOldPrice( entity.getOldPrice() );
        productDTO.setSeoText( entity.getSeoText() );
        productDTO.setInStock( entity.getInStock() );

        return productDTO;
    }

    @Override
    public List<Product> toEntity(List<ProductDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Product> list = new ArrayList<Product>( dtoList.size() );
        for ( ProductDTO productDTO : dtoList ) {
            list.add( toEntity( productDTO ) );
        }

        return list;
    }

    @Override
    public List<ProductDTO> toDto(List<Product> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ProductDTO> list = new ArrayList<ProductDTO>( entityList.size() );
        for ( Product product : entityList ) {
            list.add( toDto( product ) );
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

    protected Catalog catalogDTOToCatalog(CatalogDTO catalogDTO) {
        if ( catalogDTO == null ) {
            return null;
        }

        Catalog catalog = new Catalog();

        catalog.setProject( projectDTOToProject( catalogDTO.getProject() ) );
        catalog.setTitle( catalogDTO.getTitle() );
        catalog.setSlug( catalogDTO.getSlug() );
        catalog.setId( catalogDTO.getId() );

        return catalog;
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

    protected CatalogDTO catalogToCatalogDTO(Catalog catalog) {
        if ( catalog == null ) {
            return null;
        }

        CatalogDTO catalogDTO = new CatalogDTO();

        catalogDTO.setId( catalog.getId() );
        catalogDTO.setProject( projectToProjectDTO( catalog.getProject() ) );
        catalogDTO.setTitle( catalog.getTitle() );
        catalogDTO.setSlug( catalog.getSlug() );

        return catalogDTO;
    }
}
