package group_8.climatechangebackend.services;

import group_8.climatechangebackend.models.NorthernHemisphereTemperature;
import group_8.climatechangebackend.repositories.NorthernHemisphereTemperatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NorthernHemisphereTemperatureService {

    @Autowired
    private NorthernHemisphereTemperatureRepository repository;

    public List<NorthernHemisphereTemperature> findAll() {
        return repository.findAll();
    }

    // Add other methods as needed
}