package group_8.climatechangebackend.services;

import group_8.climatechangebackend.models.NorthernHemisphereAnnual;
import group_8.climatechangebackend.repositories.NorthernHemisphereAnnualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NorthernHemisphereAnnualService {
    @Autowired
    private NorthernHemisphereAnnualRepository repository;
    
    public List<NorthernHemisphereAnnual> findAll() {
        return repository.findAll();
    }
    
    public Optional<NorthernHemisphereAnnual> findById(Long id) {
        return repository.findById(id);
    }
    
    public NorthernHemisphereAnnual save(NorthernHemisphereAnnual data) {
        return repository.save(data);
    }
    
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}