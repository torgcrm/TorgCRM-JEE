package ru.torgcrm.jee.ecommerce.services;

import org.junit.Assert;
import org.junit.Test;
import ru.torgcrm.jee.ecommerce.dto.GenericDTO;
import ru.torgcrm.jee.ecommerce.tests.AbstractDatabaseTest;
import ru.torgcrm.jee.ecommerce.utils.generators.AbstractGenerator;

import java.util.List;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public abstract class AbstractServiceTest
        <D extends GenericDTO, S extends GenericService, G extends AbstractGenerator> extends AbstractDatabaseTest {

    abstract protected S getService();

    abstract protected G getGenerator();

    @Test
    public void findAll() {
        D dto1 = (D) getGenerator().createDto();
        D dto2 = (D) getGenerator().createDto();
        D dto3 = (D) getGenerator().createDto();

        getService().persist(dto1);
        getService().persist(dto2);
        getService().persist(dto3);

        List<D> list = getService().findAll();

        Assert.assertNotNull(list);
        Assert.assertFalse(list.isEmpty());
        Assert.assertTrue(list.size() >= 3);
    }

    @Test
    public void findById() {
        D dto = (D) getGenerator().createDto();
        D saved = (D) getService().persist(dto);

        D fromDb = (D) getService().findById(saved.getId());
        Assert.assertNotNull(fromDb);
    }

    @Test
    public void save() {
        D dto = (D) getGenerator().createDto();
        D saved = (D) getService().persist(dto);

        D fromDb = (D) getService().findById(saved.getId());
        Assert.assertNotNull(fromDb);
    }

    @Test
    public void delete() {
        D dto = (D) getGenerator().createDto();
        D saved = (D) getService().persist(dto);
        D fromDb = (D) getService().findById(saved.getId());

        getService().delete(saved.getId());

        fromDb = (D) getService().findById(saved.getId());
        Assert.assertNull(fromDb);

    }
}
