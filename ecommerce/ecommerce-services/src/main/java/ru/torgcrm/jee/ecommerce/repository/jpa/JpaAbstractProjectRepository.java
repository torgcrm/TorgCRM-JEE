package ru.torgcrm.jee.ecommerce.repository.jpa;

import org.apache.log4j.Logger;
import ru.torgcrm.jee.ecommerce.domain.AbstractProjectEntity;
import ru.torgcrm.jee.ecommerce.domain.AbstractWebPageEntity;
import ru.torgcrm.jee.ecommerce.repository.AbstractProjectRepository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public class JpaAbstractProjectRepository<T extends AbstractProjectEntity> extends JpaGenericRepository<T>
        implements AbstractProjectRepository<T> {

    private final Logger log = Logger.getLogger(JpaProductRepository.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public List<T> findAllByProjectId(Long projectId) {
        try {
            CriteriaBuilder cb = entityManager.getCriteriaBuilder();
            CriteriaQuery<T> cQuery = cb.createQuery(getTemplateClass());
            Root<T> root = cQuery.from(getTemplateClass());
            cQuery.select(root).where(cb.equal(root.get("project").get("id"), projectId));

            return entityManager.createQuery(cQuery).getResultList();
        } catch (ClassNotFoundException e) {
            log.error("Class not found exception, while trying to make criteria query: " + e.getMessage());
        }
        return null;
    }
}
