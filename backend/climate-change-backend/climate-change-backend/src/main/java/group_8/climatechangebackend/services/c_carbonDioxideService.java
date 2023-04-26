package group_8.climatechangebackend.services;

import group_8.climatechangebackend.models.c_carbonDioxide;
import group_8.climatechangebackend.repositories.c_carbonDioxideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class c_carbonDioxideService {
    @Autowired
    private c_carbonDioxideRepository repository;
    
    public List<c_carbonDioxide> findAll() {
        return repository.findAll();
    }
    

}