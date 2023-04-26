// File name: NorthernHemisphereAnnualService.java
package group_8.climatechangebackend.services;

import group_8.climatechangebackend.models.NorthernHemisphereMonthly;
import group_8.climatechangebackend.repositories.NorthernHemisphereMonthlyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NorthernHemisphereMonthlyService {

    @Autowired
    private NorthernHemisphereMonthlyRepository repository;

    public List<NorthernHemisphereMonthly> findAll() {
        return repository.findAll();
    }

    public Optional<NorthernHemisphereMonthly> findById(Long id) {
        return repository.findById(id);
    }

    public NorthernHemisphereMonthly save(NorthernHemisphereMonthly data) {
        return repository.save(data);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
    // Add other methods as needed
}
