package ru.torgcrm.jee.ecommerce.mappers;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import ru.torgcrm.jee.ecommerce.mappers.PageMapper;
import ru.torgcrm.jee.ecommerce.utils.generators.ProjectGenerator;

/**
 * Abstract class for mappers tests.
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public abstract class AbstractMapperTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addPackage(PageMapper.class.getPackage())
                .addPackage(ProjectGenerator.class.getPackage())
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    abstract public void toEntityTest();

    abstract public void toDtoTest();
}
