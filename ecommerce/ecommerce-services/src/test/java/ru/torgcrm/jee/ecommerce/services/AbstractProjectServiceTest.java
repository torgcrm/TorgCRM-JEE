package ru.torgcrm.jee.ecommerce.services;

import org.junit.Assert;
import org.junit.Test;
import ru.torgcrm.jee.ecommerce.dto.AbstractProjectDTO;
import ru.torgcrm.jee.ecommerce.dto.ProjectDTO;
import ru.torgcrm.jee.ecommerce.utils.generators.AbstractGenerator;
import ru.torgcrm.jee.ecommerce.utils.generators.ProjectGenerator;

import javax.inject.Inject;
import java.util.List;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public abstract class AbstractProjectServiceTest
        <D extends AbstractProjectDTO, S extends AbstractProjectService, G extends AbstractGenerator>
        extends AbstractServiceTest<D, S, G> {

    @Inject
    ProjectService projectService;
    @Inject
    ProjectGenerator projectGenerator;

    @Test
    public void findAllByProjectId() {
        ProjectDTO projectDTO = projectGenerator.createDto();
        ProjectDTO saved = projectService.persist(projectDTO);

        D dto1 = (D) getGenerator().createDto();
        D dto2 = (D) getGenerator().createDto();
        D dto3 = (D) getGenerator().createDto();

        dto1.setProject(saved);
        dto2.setProject(saved);
        dto3.setProject(saved);

        getService().merge(dto1);
        getService().merge(dto2);
        getService().merge(dto3);

        List list = getService().findAllByProjectId(dto1.getProject().getId());

        Assert.assertNotNull(list);
        Assert.assertFalse(list.isEmpty());
        Assert.assertTrue(list.size() >= 3);
    }
}
