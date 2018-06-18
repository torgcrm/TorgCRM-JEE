package ru.torgcrm.jee.ecommerce.repository;

import org.junit.Test;
import ru.torgcrm.jee.ecommerce.domain.AbstractProjectEntity;
import ru.torgcrm.jee.ecommerce.tests.AbstractDatabaseTest;
import ru.torgcrm.jee.ecommerce.utils.generators.AbstractGenerator;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public abstract class AbstractRepositoryTest<E extends AbstractProjectEntity,
        R extends GenericRepository,
        G extends AbstractGenerator> extends AbstractDatabaseTest implements RepositoryTest {

    abstract protected R getRepository();

    abstract protected G getGenerator();

    @Test
    @Override
    public void findAllTest() {
        getRepository().persist(getGenerator().createEntity());
        getRepository().persist(getGenerator().createEntity());
        getRepository().persist(getGenerator().createEntity());

        List listFromDb = getRepository().findAll();
        assertFalse(listFromDb.isEmpty());
        assertTrue(listFromDb.size() >= 3);
    }

    @Test
    @Override
    public void findByIdTest() {
        E entity1 = (E) getGenerator().createEntity();
        getRepository().persist(entity1);

        E fromDb = (E) getRepository().findById(entity1.getId());
        assertNotNull(fromDb);
    }

    @Test
    @Override
    public void saveTest() {
        E entity1 = (E) getGenerator().createEntity();
        getRepository().persist(entity1);

        E fromDb = (E) getRepository().findById(entity1.getId());
        assertNotNull(fromDb);
    }

    @Test
    @Override
    public void deleteTest() {
        E entity1 = (E) getGenerator().createEntity();
        getRepository().persist(entity1);

        getRepository().delete(entity1.getId());

        E fromDb = (E) getRepository().findById(entity1.getId());
        assertNull(fromDb);
    }
}
