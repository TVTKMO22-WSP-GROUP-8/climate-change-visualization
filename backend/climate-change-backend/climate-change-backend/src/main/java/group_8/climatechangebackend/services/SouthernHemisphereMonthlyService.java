// File name: SouthernHemisphereMonthlyService.java
package group_8.climatechangebackend.services;

import group_8.climatechangebackend.models.SouthernHemisphereMonthly;
import group_8.climatechangebackend.repositories.SouthernHemisphereMonthlyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SouthernHemisphereMonthlyService {
    @Autowired
    private SouthernHemisphereMonthlyRepository repository;

    public List<SouthernHemisphereMonthly> findAll() {
        return repository.findAll();
    }

    public Optional<SouthernHemisphereMonthly> findById(Long id) {
        return repository.findById(id);
    }

    public SouthernHemisphereMonthly save(SouthernHemisphereMonthly data) {
        return repository.save(data);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
    // Add other methods as needed
}
