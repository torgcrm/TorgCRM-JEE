package ru.torgcrm.jee.ecommerce.repository.jpa;

import org.apache.log4j.Logger;
import ru.torgcrm.jee.ecommerce.domain.AbstractWebPage;
import ru.torgcrm.jee.ecommerce.repository.AbstractWebPageRepository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public class JpaAbstractWebPageRepository<T extends AbstractWebPage> extends JpaGenericRepository<T>
        implements AbstractWebPageRepository<T> {

    private final Logger log = Logger.getLogger(JpaProductRepository.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public T findBySlugAndProjectId(String slug, Long projectId) {
        try {
            CriteriaBuilder cb = entityManager.getCriteriaBuilder();
            CriteriaQuery<T> cQuery = cb.createQuery(getTemplateClass());
            Root<T> root = cQuery.from(getTemplateClass());
            cQuery.select(root)
                    .where(cb.equal(root.get("project").get("id"), projectId))
                    .where(cb.equal(root.get("slug"), slug));
            return entityManager.createQuery(cQuery).getSingleResult();
        } catch (Exception e) {
            log.error("Something went wrong while trying to execute query: " + e.getMessage());
        }
        return null;
    }
}
