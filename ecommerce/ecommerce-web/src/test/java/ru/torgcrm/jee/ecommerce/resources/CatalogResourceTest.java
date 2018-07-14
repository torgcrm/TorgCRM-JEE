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
import ru.torgcrm.jee.ecommerce.utils.generators.CatalogGenerator;
import ru.torgcrm.jee.ecommerce.utils.generators.ProjectGenerator;

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

    CatalogGenerator catalogGenerator;
    ProjectGenerator projectGenerator;

    @Before
    public void init() {
        catalogResource = new CatalogResource();
        catalogResource.catalogService = catalogService;
        catalogResource.productService = productService;
        catalogResource.projectService = projectService;
        catalogResource.request = request;

        projectGenerator = new ProjectGenerator();
        catalogGenerator = new CatalogGenerator();
        catalogGenerator.setProjectGenerator(projectGenerator);
    }

    @Test
    public void test() {
        List<CatalogDTO> catalogDTOS = new ArrayList<>();
        catalogDTOS.add(catalogGenerator.createDto());
        catalogDTOS.add(catalogGenerator.createDto());

        ProjectDTO projectDTO = projectGenerator.createDto();
        projectDTO.setId(1L);

        Mockito.doReturn("test").when(request).getHeader(PROJECT_HOST_HEADER);
        Mockito.doReturn(projectDTO).when(projectService).findOneByHost("test");
        Mockito.doReturn(catalogDTOS).when(catalogService).findAllByProjectId(projectDTO.getId());
        catalogResource.getCurrentProject();

        List<CatalogDTO> catalogDTOList = catalogResource.getCatalogList();
        System.out.println(catalogDTOList.size());
    }
}
