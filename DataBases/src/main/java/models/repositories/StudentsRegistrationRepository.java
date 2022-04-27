package models.repositories;

import models.domain.StudentsRegistrationEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class StudentsRegistrationRepository implements IRepository<StudentsRegistrationEntity, Integer>{

    private EntityManagerFactory entityManagerFactory = null;
    private EntityManager entityManager = null;

    public StudentsRegistrationRepository(){
        entityManagerFactory = Persistence.createEntityManagerFactory("students_registration");
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public void save(StudentsRegistrationEntity entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }

    @Override
    public void update(StudentsRegistrationEntity entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }

    @Override
    public StudentsRegistrationEntity findById(Integer id) {
        return entityManager.find(StudentsRegistrationEntity.class, id);
    }

    @Override
    public void delete(StudentsRegistrationEntity entity) {
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<StudentsRegistrationEntity> findAll() {
        return entityManager.createQuery("from StudentsRegistrationEntity").getResultList();
    }

    @Override
    public void deleteAll() {
        List<StudentsRegistrationEntity> registrations = findAll();
        for (var registration: registrations) {
            delete(registration);
        }
    }
}
