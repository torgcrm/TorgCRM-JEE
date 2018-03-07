package ru.torgcrm.jee.ecommerce.migrations;

import org.apache.log4j.Logger;
import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.FlywayException;

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

    Logger log = Logger.getLogger(getClass().getName());

    @Resource(lookup = "jdbc/TorgCRM_Main")
    private DataSource dataSource;

    @PostConstruct
    private void onStartUp() {
        try {
            Flyway flyway = new Flyway();
            flyway.setDataSource(dataSource);
            flyway.setSchemas("torgcrm");
            flyway.migrate();
        } catch (FlywayException e) {
            log.error("Can't migrate database script: " + e.getMessage());
        }
    }
}
