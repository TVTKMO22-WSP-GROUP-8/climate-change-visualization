package group_8.climatechangebackend.services;

import group_8.climatechangebackend.models.SouthernHemisphereTemperature;
import group_8.climatechangebackend.repositories.SouthernHemisphereTemperatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SouthernHemisphereTemperatureService {

    @Autowired
    private SouthernHemisphereTemperatureRepository repository;

    public List<SouthernHemisphereTemperature> findAll() {
        return repository.findAll();
    }

    // Add other methods as needed
}