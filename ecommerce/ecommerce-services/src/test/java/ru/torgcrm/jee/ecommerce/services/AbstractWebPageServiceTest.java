package ru.torgcrm.jee.ecommerce.services;

import org.junit.Assert;
import org.junit.Test;
import ru.torgcrm.jee.ecommerce.dto.AbstractWebPageDTO;
import ru.torgcrm.jee.ecommerce.utils.generators.AbstractGenerator;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public abstract class AbstractWebPageServiceTest
        <D extends AbstractWebPageDTO, S extends AbstractWebPageService, G extends AbstractGenerator>
        extends AbstractProjectServiceTest<D, S, G> {
    @Test
    public void findBySlugAndProjectId() {
        D dto = (D) getGenerator().createDto();
        D saved = (D) getService().persist(dto);
        D fromDb = (D) getService().findById(saved.getId());

        D fromDbBySlugAndProjectId = (D) getService().findBySlugAndProjectId(fromDb.getSlug(), fromDb.getProject().getId());
        Assert.assertNotNull(fromDbBySlugAndProjectId);
    }
}
