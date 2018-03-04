package ru.torgcrm.jee.ecommerce.migrations;

import org.flywaydb.core.Flyway;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.sql.DataSource;

/**
 * Manage database migrations
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Singleton
@Startup
public class FlyWayMigrator {

    @Resource(lookup = "jdbc/TorgCRM_Main")
    private DataSource dataSource;

    @PostConstruct
    private void onStartUp() {
        Flyway flyway = new Flyway();
        flyway.setDataSource(dataSource);
        flyway.setSchemas("torgcrm");
        flyway.migrate();
    }
}
