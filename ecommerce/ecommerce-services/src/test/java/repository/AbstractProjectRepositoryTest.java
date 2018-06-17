package repository;

import lombok.extern.log4j.Log4j;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.torgcrm.jee.ecommerce.domain.AbstractProjectEntity;
import ru.torgcrm.jee.ecommerce.domain.Project;
import ru.torgcrm.jee.ecommerce.repository.GenericRepository;
import ru.torgcrm.jee.ecommerce.repository.ProjectRepository;
import ru.torgcrm.jee.ecommerce.utils.generators.AbstractGenerator;

import javax.inject.Inject;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public abstract class AbstractProjectRepositoryTest
        <E extends AbstractProjectEntity, R extends GenericRepository,
                G extends AbstractGenerator> extends AbstractRepositoryTest<E, R, G>
        implements ProjectRepositoryTest<E> {

    @Inject
    private ProjectRepository projectRepository;

    @Test
    @Override
    public void findAllByProjectIdTest() {
        E entity1 = (E) getGenerator().createEntity();
        E entity2 = (E) getGenerator().createEntity();
        E entity3 = (E) getGenerator().createEntity();

        getRepository().persist(entity1);

        Project project = projectRepository.getReference(entity1.getProject().getId());

        entity2.setProject(project);
        entity3.setProject(project);

        getRepository().merge(entity2);
        getRepository().merge(entity3);

        List<E> productsFromDb = getRepository()
                .findAllByProjectId(entity1.getProject().getId());

        assertFalse(productsFromDb.isEmpty());
        assertTrue(productsFromDb.size() >= 3);
    }
}
