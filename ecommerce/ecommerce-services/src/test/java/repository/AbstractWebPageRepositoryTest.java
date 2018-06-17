package repository;

import lombok.extern.log4j.Log4j;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.torgcrm.jee.ecommerce.domain.AbstractWebPage;
import ru.torgcrm.jee.ecommerce.repository.AbstractWebPageRepository;
import ru.torgcrm.jee.ecommerce.utils.generators.AbstractGenerator;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public abstract class AbstractWebPageRepositoryTest
        <E extends AbstractWebPage, R extends AbstractWebPageRepository,
                G extends AbstractGenerator> extends AbstractRepositoryTest<E, R, G>
        implements WebPageRepositoryTest<E> {

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
