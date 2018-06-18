package ru.torgcrm.jee.ecommerce.repository;

import org.junit.Test;
import ru.torgcrm.jee.ecommerce.domain.AbstractWebPageEntity;
import ru.torgcrm.jee.ecommerce.utils.generators.AbstractGenerator;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public abstract class AbstractWebPageRepositoryTest
        <E extends AbstractWebPageEntity, R extends AbstractWebPageRepository,
                G extends AbstractGenerator> extends AbstractProjectRepositoryTest<E, R, G>
        implements WebPageRepositoryTest {

    abstract protected R getRepository();

    abstract protected G getGenerator();

    @Test
    @Override
    public void findBySlugAndProjectIdTest() {
        E entity = (E) getGenerator().createEntity();
        E saved = (E) getRepository().persist(entity);

        E fromDb = (E) getRepository().findBySlugAndProjectId(
                entity.getSlug(), entity.getProject().getId());

        assertNotNull(fromDb);
        assertTrue(saved.equals(fromDb));
    }

}
