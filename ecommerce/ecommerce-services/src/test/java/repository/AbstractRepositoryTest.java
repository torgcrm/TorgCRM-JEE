package repository;

import lombok.extern.log4j.Log4j;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.runner.RunWith;
import ru.yandex.qatools.embed.postgresql.EmbeddedPostgres;
import ru.yandex.qatools.embed.postgresql.distribution.Version;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Collections;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Log4j
@RunWith(Arquillian.class)
public abstract class AbstractRepositoryTest<T> implements WebPageRepositoryTest<T> {
    public static void initialize() throws IOException {
        final EmbeddedPostgres postgres = new EmbeddedPostgres(Version.Main.V10);
        postgres.start(EmbeddedPostgres.cachedRuntimeConfig(Paths.get(".")),
                "localhost",
                5432,
                "torgcrm",
                "torgcrm",
                "torgcrm",
                Collections.EMPTY_LIST);
    }

    @Deployment
    public static WebArchive createDeployment() throws IOException {
        initialize();
        return ShrinkWrap.create(WebArchive.class, "jpa-test.war")
                .addPackages(true, "ru.torgcrm")
                .addAsResource("META-INF/persistence.xml")
                .addAsResource("db/migrations")
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
    }
}
