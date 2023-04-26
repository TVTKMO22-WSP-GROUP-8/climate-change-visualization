// File name: GlobalAnnualService.java
package group_8.climatechangebackend.services;

import group_8.climatechangebackend.models.GlobalAnnual;
import group_8.climatechangebackend.repositories.GlobalAnnualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GlobalAnnualService {
    @Autowired
    private GlobalAnnualRepository repository;
    
    public List<GlobalAnnual> findAll() {
        return repository.findAll();
    }
    
    public Optional<GlobalAnnual> findById(Long id) {
        return repository.findById(id);
    }
    
    public GlobalAnnual save(GlobalAnnual data) {
        return repository.save(data);
    }
    
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}