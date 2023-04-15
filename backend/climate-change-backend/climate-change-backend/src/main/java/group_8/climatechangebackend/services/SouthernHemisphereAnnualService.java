package group_8.climatechangebackend.services;

import group_8.climatechangebackend.models.SouthernHemisphereAnnual;
import group_8.climatechangebackend.repositories.SouthernHemisphereAnnualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SouthernHemisphereAnnualService {

    @Autowired
    private SouthernHemisphereAnnualRepository repository;
    
    public List<SouthernHemisphereAnnual> findAll() {
        return repository.findAll();
    }
    
    public Optional<SouthernHemisphereAnnual> findById(Long id) {
        return repository.findById(id);
    }
    
    public SouthernHemisphereAnnual save(SouthernHemisphereAnnual data) {
        return repository.save(data);
    }
    
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    // Add other methods as needed
}