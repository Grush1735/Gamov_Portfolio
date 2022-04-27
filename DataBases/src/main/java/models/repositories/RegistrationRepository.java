package models.repositories;

import models.domain.RegistrationEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class RegistrationRepository implements IRepository<RegistrationEntity, Integer>{

    private EntityManagerFactory entityManagerFactory = null;
    private EntityManager entityManager = null;

    public RegistrationRepository(){
        entityManagerFactory = Persistence.createEntityManagerFactory("registration");
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public void save(RegistrationEntity entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }

    @Override
    public void update(RegistrationEntity entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }

    @Override
    public RegistrationEntity findById(Integer id) {
        return entityManager.find(RegistrationEntity.class, id);
    }

    @Override
    public void delete(RegistrationEntity entity) {
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<RegistrationEntity> findAll() {
        return entityManager.createQuery("from RegistrationEntity").getResultList();
    }

    @Override
    public void deleteAll() {
        List<RegistrationEntity> registrations = findAll();
        for (var registration: registrations) {
            delete(registration);
        }
    }
}
