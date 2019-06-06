import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Logger;

public abstract class AbstractDao {
    @PersistenceContext(unitName = "studentUnit")
    protected EntityManager entityManager;

    public <T> void create(T object) {
        getLogger().info("create - invoked " + object);
        entityManager.persist(object);
    }

    public <T> boolean update(T object) {
        getLogger().info("update - invoked " + object);
        entityManager.merge(object);
        getLogger().info("update - record updated");
        return true;
    }

    public <T> boolean delete(Object pk) {
        getLogger().info("delete - invoked " + pk);
        T object = entityManager.find(getType(), pk);
        entityManager.remove(object);

        return true;
    }
    public <T> T get(Object pk) {
        getLogger().info("get - invoked for: " + pk);
        return entityManager.find(getType(), pk);
    }
/*

    public <T> List<T> list(final int offset, final int limit) {
        getLogger().info("list - invoked");
        final CriteriaQuery<T> criteriaQuery = entityManager.getCriteriaBuilder().createQuery(getType());
        criteriaQuery.from(getType());
        final TypedQuery<T> query = entityManager.createQuery(criteriaQuery);
        query.setFirstResult(offset).setMaxResults(limit);
        return query.getResultList();
    }
*/

    protected <T> Optional<T> getSingleResult(List<T> resultList) {
        getLogger().info("getSingleResult invoked...");
        return resultList.isEmpty() ? Optional.empty() : Optional.of(resultList.get(0));
    }

    protected void fillQueryParameters(final Query query, final Map<String, Object> filters) {
        for (final Map.Entry<String, Object> filter : filters.entrySet()) {
            query.setParameter(filter.getKey(), filter.getValue());
        }
    }

    protected <T> T getSingleResult(final TypedQuery<T> query) {
        try {
            return query.getSingleResult();
        } catch (final NoResultException e) {
            return null;
        }
    }

    public List<StudentJPA> list() {
        getLogger().info("list - invoked");
        TypedQuery<StudentJPA> query = entityManager.createQuery("select s from StudentJPA s",StudentJPA.class);
        return query.getResultList();
    }

/*    public <T> List<T> list() {
        getLogger().info("list - invoked");
        final CriteriaQuery<T> criteriaQuery = entityManager.getCriteriaBuilder().createQuery(getType());
        System.out.println(getType().toString());
        criteriaQuery.from(getType());
        final TypedQuery<T> query = entityManager.createQuery(criteriaQuery);
        //query.setFirstResult(offset).setMaxResults(limit);
        return query.getResultList();
    }*/


    protected abstract Logger getLogger();
    protected abstract <T> Class<T> getType();
}
