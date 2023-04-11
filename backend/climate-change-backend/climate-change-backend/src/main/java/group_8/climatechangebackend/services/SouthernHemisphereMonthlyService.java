package group_8.climatechangebackend.services;

import group_8.climatechangebackend.models.SouthernHemisphereMonthly;
import group_8.climatechangebackend.repositories.SouthernHemisphereMonthlyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SouthernHemisphereMonthlyService {

    @Autowired
    private SouthernHemisphereMonthlyRepository repository;

    public List<SouthernHemisphereMonthly> findAll() {
        return repository.findAll();
    }

    // Add other methods as needed
}
