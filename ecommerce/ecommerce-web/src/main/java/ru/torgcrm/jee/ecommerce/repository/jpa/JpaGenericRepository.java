package ru.torgcrm.jee.ecommerce.repository.jpa;

import com.google.common.reflect.TypeToken;
import org.apache.log4j.Logger;
import ru.torgcrm.jee.ecommerce.domain.GenericEntity;
import ru.torgcrm.jee.ecommerce.repository.GenericRepository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Generic JPA repository
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public class JpaGenericRepository<T extends GenericEntity>
        implements GenericRepository<T> {
    private final Logger log = Logger.getLogger(JpaGenericRepository.class);

    @PersistenceContext
    protected EntityManager entityManager;

    private final TypeToken<T> typeToken = new TypeToken<T>(getClass()) {};
    private final Type type = typeToken.getType();

    /**
     * {@inheritDoc}
     */
    @Override
    public List<T> findAll() {
        try {
            CriteriaBuilder cb = entityManager.getCriteriaBuilder();
            CriteriaQuery<T> cQuery = cb.createQuery(getTemplateClass());
            Root<T> root = cQuery.from(getTemplateClass());
            cQuery.select(root);
            return entityManager.createQuery(cQuery).getResultList();
        } catch (ClassNotFoundException e) {
            log.error("Class not found exception, while trying to make criteria query: " + e.getMessage());
        }
        return null;
    }

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

    /**
     * {@inheritDoc}
     */
    @Override
    public T findById(Long id) {
        try {
            CriteriaBuilder cb = entityManager.getCriteriaBuilder();
            CriteriaQuery<T> cQuery = cb.createQuery(getTemplateClass());
            Root<T> root = cQuery.from(getTemplateClass());
            cQuery.select(root).where(cb.equal(root.get("id"), id));
            return entityManager.createQuery(cQuery).getSingleResult();
        } catch (ClassNotFoundException e) {
            log.error("Class not found exception, while trying to make criteria query: " + e.getMessage());
        } catch (NoResultException e) {
            try {
                log.error("No result selected. " + getTemplateClass().getTypeName());
            } catch (Exception ex) {
                log.error(e.getMessage());
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T save(T entity) {
        entityManager.persist(entity);
        entityManager.refresh(entity);
        return entity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(T entity) {
        entityManager.remove(entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(Long id) {
        entityManager.remove(findById(id));
    }

    /**
     * {@inheritDoc}
     */
    protected Class getTemplateClass() throws ClassNotFoundException {
        return Class.forName(type.getTypeName());
    }
}
