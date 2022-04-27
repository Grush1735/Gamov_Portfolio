package models.services;

import models.domain.StudentsEntity;
import models.repositories.StudentsRepository;

import java.util.List;

public class StudentsService {

    private static StudentsRepository studentsRepository;

    public StudentsService(){
        studentsRepository = new StudentsRepository();
    }

    public void save(StudentsEntity entity){
        studentsRepository.save(entity);
    }

    public void update(StudentsEntity entity){
        studentsRepository.update(entity);
    }

    public void delete(StudentsEntity entity){
        studentsRepository.delete(entity);
    }

    public void delete(int id){
        StudentsEntity students = studentsRepository.findById(id);
        studentsRepository.delete(students);

    }

    public StudentsEntity getById(int id){
        return studentsRepository.findById(id);
    }

    public List<StudentsEntity> findAll(){
        return studentsRepository.findAll();
    }

    public void deleteAll(){
        studentsRepository.deleteAll();
    }

}
