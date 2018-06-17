package repository;

import de.flapdoodle.embed.process.config.IRuntimeConfig;
import lombok.extern.log4j.Log4j;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.torgcrm.jee.ecommerce.domain.AbstractProjectEntity;
import ru.torgcrm.jee.ecommerce.repository.GenericRepository;
import ru.torgcrm.jee.ecommerce.repository.jpa.JpaProductRepository;
import ru.torgcrm.jee.ecommerce.utils.generators.AbstractGenerator;
import ru.yandex.qatools.embed.postgresql.EmbeddedPostgres;
import ru.yandex.qatools.embed.postgresql.distribution.Version;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Log4j
@RunWith(Arquillian.class)
public abstract class AbstractRepositoryTest<E extends AbstractProjectEntity,
        R extends GenericRepository,
        G extends AbstractGenerator> implements RepositoryTest<E> {

    final static EmbeddedPostgres postgres = new EmbeddedPostgres(Version.Main.V10);
    final static IRuntimeConfig config = EmbeddedPostgres.cachedRuntimeConfig(Paths.get("."));

    abstract protected R getRepository();

    abstract protected G getGenerator();

    public static void initialize() throws IOException, SQLException {
        postgres.start(config,
                "localhost",
                5432,
                "torgcrm",
                "torgcrm",
                "torgcrm",
                Collections.EMPTY_LIST);
        final Connection conn = DriverManager.getConnection(postgres.getConnectionUrl().get());
        conn.createStatement().execute("DROP SCHEMA public CASCADE;");
        conn.createStatement().execute("CREATE SCHEMA public;");

        postgres.getProcess().get().importFromFile(
                new File(JpaProductRepository.class.getClassLoader()
                        .getResource("db/migrations/V1__20180304_init.sql").getFile()));
    }

    @Deployment
    public static WebArchive createDeployment() throws IOException, SQLException {
        initialize();
        return ShrinkWrap.create(WebArchive.class, "jpa-test.war")
                .addPackages(true, "ru.torgcrm")
                .addAsResource("META-INF/persistence.xml")
                .addAsResource("db/migrations")
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
    }

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
