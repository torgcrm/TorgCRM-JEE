package ru.torgcrm.jee.ecommerce.resources;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import ru.torgcrm.jee.ecommerce.dto.CatalogDTO;
import ru.torgcrm.jee.ecommerce.dto.ProjectDTO;
import ru.torgcrm.jee.ecommerce.services.CatalogService;
import ru.torgcrm.jee.ecommerce.services.ProductService;
import ru.torgcrm.jee.ecommerce.services.ProjectService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatalogResourceTest {
    private final String PROJECT_HOST_HEADER = "Project-Host";

    CatalogResource catalogResource;
    @Mock
    ProjectService projectService;
    @Mock
    ProductService productService;
    @Mock
    CatalogService catalogService;
    @Mock
    HttpServletRequest request;

    @Before
    public void init() {
        catalogResource = new CatalogResource();
        catalogResource.catalogService = catalogService;
        catalogResource.productService = productService;
        catalogResource.projectService = projectService;
        catalogResource.request = request;
    }

    @Test
    public void test() {
        List<CatalogDTO> catalogDTOS = new ArrayList<>();
        catalogDTOS.add(new CatalogDTO());
        ProjectDTO projectDTO = new ProjectDTO();
        projectDTO.setId(1L);

        Mockito.doReturn("test").when(request).getHeader(PROJECT_HOST_HEADER);
        Mockito.doReturn(projectDTO).when(projectService).findOneByHost("test");
        Mockito.doReturn(catalogDTOS).when(catalogService).findAllByProjectId(1L);
        catalogResource.getCurrentProject();

        List<CatalogDTO> catalogDTOList = catalogResource.getCatalog();
        System.out.println(catalogDTOList.size());
    }
}
