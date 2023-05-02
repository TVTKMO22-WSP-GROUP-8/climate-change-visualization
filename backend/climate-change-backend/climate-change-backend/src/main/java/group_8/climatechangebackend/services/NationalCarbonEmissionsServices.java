package group_8.climatechangebackend.services;

import group_8.climatechangebackend.models.NorthernHemisphere2000;
import group_8.climatechangebackend.repositories.NorthernHemisphere2000Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NationalCarbonEmissionsServices {
    @Autowired
    private NationalCarbonEmissionsServices repository;

    public List<NationalCarbonEmissionsServices> findAll() {
        return repository.findAll();
    }
}

