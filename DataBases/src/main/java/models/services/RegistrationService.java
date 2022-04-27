package models.services;

import models.domain.RegistrationEntity;
import models.repositories.RegistrationRepository;

import java.util.List;

public class RegistrationService {

    private static RegistrationRepository registrationRepository;

    public RegistrationService(){
        registrationRepository = new RegistrationRepository();
    }

    public void save(RegistrationEntity entity){
        registrationRepository.save(entity);
    }

    public void update(RegistrationEntity entity){
        registrationRepository.update(entity);
    }

    public void delete(RegistrationEntity entity){
        registrationRepository.delete(entity);
    }

    public void delete(int id){
        RegistrationEntity registration = registrationRepository.findById(id);
        registrationRepository.delete(registration);

    }

    public RegistrationEntity getById(int id){
        return registrationRepository.findById(id);
    }

    public List<RegistrationEntity> findAll(){
        return registrationRepository.findAll();
    }

    public void deleteAll(){
        registrationRepository.deleteAll();
    }

}
