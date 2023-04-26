// File name: GlobalAnnualService.java
package group_8.climatechangebackend.services;

import group_8.climatechangebackend.models.GlobalMonthly;
import group_8.climatechangebackend.repositories.GlobalMonthlyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GlobalMonthlyService {
    @Autowired
    private GlobalMonthlyRepository repository;
    
    public List<GlobalMonthly> findAll() {
        return repository.findAll();
    }
    
    public Optional<GlobalMonthly> findById(Long id) {
        return repository.findById(id);
    }
    
    public GlobalMonthly save(GlobalMonthly data) {
        return repository.save(data);
    }
    
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}