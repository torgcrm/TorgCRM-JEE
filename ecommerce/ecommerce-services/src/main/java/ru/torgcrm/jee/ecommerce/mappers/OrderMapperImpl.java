package ru.torgcrm.jee.ecommerce.mappers;

import ru.torgcrm.jee.ecommerce.domain.Catalog;
import ru.torgcrm.jee.ecommerce.domain.Order;
import ru.torgcrm.jee.ecommerce.domain.Product;
import ru.torgcrm.jee.ecommerce.domain.Project;
import ru.torgcrm.jee.ecommerce.dto.CatalogDTO;
import ru.torgcrm.jee.ecommerce.dto.OrderDTO;
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
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order toEntity(OrderDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Order order = new Order();

        order.setProject( projectDTOToProject( dto.getProject() ) );
        order.setId( dto.getId() );
        order.setProcessId( dto.getProcessId() );
        order.setProducts( productDTOListToProductList( dto.getProducts() ) );

        return order;
    }

    @Override
    public OrderDTO toDto(Order entity) {
        if ( entity == null ) {
            return null;
        }

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setId( entity.getId() );
        orderDTO.setProject( projectToProjectDTO( entity.getProject() ) );
        orderDTO.setProcessId( entity.getProcessId() );
        orderDTO.setProducts( productListToProductDTOList( entity.getProducts() ) );

        return orderDTO;
    }

    @Override
    public List<Order> toEntity(List<OrderDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Order> list = new ArrayList<Order>( dtoList.size() );
        for ( OrderDTO orderDTO : dtoList ) {
            list.add( toEntity( orderDTO ) );
        }

        return list;
    }

    @Override
    public List<OrderDTO> toDto(List<Order> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrderDTO> list = new ArrayList<OrderDTO>( entityList.size() );
        for ( Order order : entityList ) {
            list.add( toDto( order ) );
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

    protected Product productDTOToProduct(ProductDTO productDTO) {
        if ( productDTO == null ) {
            return null;
        }

        Product product = new Product();

        product.setProject( projectDTOToProject( productDTO.getProject() ) );
        product.setTitle( productDTO.getTitle() );
        product.setSlug( productDTO.getSlug() );
        product.setSeoText( productDTO.getSeoText() );
        product.setId( productDTO.getId() );
        product.setCatalog( catalogDTOToCatalog( productDTO.getCatalog() ) );
        product.setViewName( productDTO.getViewName() );
        product.setShortDesc( productDTO.getShortDesc() );
        product.setArticle( productDTO.getArticle() );
        product.setPrice( productDTO.getPrice() );
        product.setOldPrice( productDTO.getOldPrice() );
        product.setInStock( productDTO.getInStock() );

        return product;
    }

    protected List<Product> productDTOListToProductList(List<ProductDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Product> list1 = new ArrayList<Product>( list.size() );
        for ( ProductDTO productDTO : list ) {
            list1.add( productDTOToProduct( productDTO ) );
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

    protected ProductDTO productToProductDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();

        productDTO.setId( product.getId() );
        productDTO.setProject( projectToProjectDTO( product.getProject() ) );
        productDTO.setTitle( product.getTitle() );
        productDTO.setSlug( product.getSlug() );
        productDTO.setCatalog( catalogToCatalogDTO( product.getCatalog() ) );
        productDTO.setViewName( product.getViewName() );
        productDTO.setShortDesc( product.getShortDesc() );
        productDTO.setArticle( product.getArticle() );
        productDTO.setPrice( product.getPrice() );
        productDTO.setOldPrice( product.getOldPrice() );
        productDTO.setSeoText( product.getSeoText() );
        productDTO.setInStock( product.getInStock() );

        return productDTO;
    }

    protected List<ProductDTO> productListToProductDTOList(List<Product> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductDTO> list1 = new ArrayList<ProductDTO>( list.size() );
        for ( Product product : list ) {
            list1.add( productToProductDTO( product ) );
        }

        return list1;
    }
}
