package ru.torgcrm.jee.ecommerce.tests;

import de.flapdoodle.embed.process.config.IRuntimeConfig;
import lombok.extern.log4j.Log4j;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.runner.RunWith;
import ru.torgcrm.jee.ecommerce.repository.jpa.JpaProductRepository;
import ru.yandex.qatools.embed.postgresql.EmbeddedPostgres;
import ru.yandex.qatools.embed.postgresql.distribution.Version;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collections;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Log4j
@RunWith(Arquillian.class)
public abstract class AbstractDatabaseTest {
    final static EmbeddedPostgres postgres = new EmbeddedPostgres(Version.Main.V10);
    final static IRuntimeConfig config = EmbeddedPostgres.cachedRuntimeConfig(Paths.get("."));

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
}
