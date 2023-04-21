package group_8.climatechangebackend.services;

import group_8.climatechangebackend.models.a_gast;
import group_8.climatechangebackend.repositories.a_gastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class a_gastService {
    @Autowired
    private a_gastRepository repository;
    
    public List<a_gast> findAll() {
        return repository.findAll();
    }
    
}