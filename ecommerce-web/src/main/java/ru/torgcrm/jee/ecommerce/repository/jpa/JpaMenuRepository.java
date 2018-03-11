package ru.torgcrm.jee.ecommerce.repository.jpa;

import org.apache.log4j.Logger;
import ru.torgcrm.jee.ecommerce.domain.Menu;
import ru.torgcrm.jee.ecommerce.repository.MenuRepository;

import javax.enterprise.context.ApplicationScoped;

/**
 * Menu repository, see {@link Menu}
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@ApplicationScoped
public class JpaMenuRepository extends JpaGenericRepository<Menu>
        implements MenuRepository {
    private final Logger log = Logger.getLogger(JpaMenuRepository.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public Menu findByProjectIdAndCode(Long projectId, String code) {
        try {
            return entityManager.createNamedQuery(Menu.FIND_BY_PROJECT_AND_CODE, Menu.class)
                    .setParameter("projectId", projectId)
                    .setParameter("code", code)
                    .getSingleResult();
        } catch (Exception e) {
            log.error("Class not found exception, while trying to select Menu: " + e.getMessage());
        }
        return null;
    }
}
