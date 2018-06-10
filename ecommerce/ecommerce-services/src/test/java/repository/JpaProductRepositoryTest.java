package repository;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.torgcrm.jee.ecommerce.repository.PageRepository;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@RunWith(Arquillian.class)
public class JpaProductRepositoryTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addPackage(PageRepository.class.getPackage())
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Test
    public void saveTest() {

    }
}
