package models.services;

import models.domain.StudentsRegistrationEntity;
import models.repositories.StudentsRegistrationRepository;

import java.util.List;

public class StudentsRegistrationService {

    private static StudentsRegistrationRepository studentsRegistrationRepository;

    public StudentsRegistrationService(){
        studentsRegistrationRepository = new StudentsRegistrationRepository();
    }

    public void save(StudentsRegistrationEntity entity){
        studentsRegistrationRepository.save(entity);
    }

    public void update(StudentsRegistrationEntity entity){
        studentsRegistrationRepository.update(entity);
    }

    public void delete(StudentsRegistrationEntity entity){
        studentsRegistrationRepository.delete(entity);
    }

    public void delete(int id){
        StudentsRegistrationEntity registration = studentsRegistrationRepository.findById(id);
        studentsRegistrationRepository.delete(registration);

    }

    public StudentsRegistrationEntity getById(int id){
        return studentsRegistrationRepository.findById(id);
    }

    public List<StudentsRegistrationEntity> findAll(){
        return studentsRegistrationRepository.findAll();
    }

    public void deleteAll(){
        studentsRegistrationRepository.deleteAll();
    }

}
