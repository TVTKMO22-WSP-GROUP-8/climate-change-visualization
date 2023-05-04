package group_8.climatechangebackend.services;

import group_8.climatechangebackend.models.NationalCarbonEmissions2021;
import group_8.climatechangebackend.repositories.NationalCarbonEmissionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NationalCarbonEmissionsService {
    @Autowired
    private NationalCarbonEmissionsService repository;

    public List<NationalCarbonEmissionsService> findAll() {
        return repository.findAll();
    }
}

