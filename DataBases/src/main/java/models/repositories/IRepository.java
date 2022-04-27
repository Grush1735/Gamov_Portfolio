package models.repositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.io.Serializable;
import java.util.List;

public interface IRepository<T, Id extends Serializable> {
    void save(T entity);
    void update(T entity);
    T findById (Id id);
    void delete(T entity);
    List<T> findAll();
    void deleteAll();


}
