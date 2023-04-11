package group_8.climatechangebackend.services;

import group_8.climatechangebackend.models.SouthernHemisphereAnnual;
import group_8.climatechangebackend.repositories.SouthernHemisphereAnnualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SouthernHemisphereAnnualService {

    @Autowired
    private SouthernHemisphereAnnualRepository repository;

    public List<SouthernHemisphereAnnual> findAll() {
        return repository.findAll();
    }

    // Add other methods as needed
}