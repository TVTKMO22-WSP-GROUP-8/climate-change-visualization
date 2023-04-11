package group_8.climatechangebackend.services;

import group_8.climatechangebackend.models.NorthernHemisphereMonthly;
import group_8.climatechangebackend.repositories.NorthernHemisphereMonthlyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NorthernHemisphereMonthlyService {

    @Autowired
    private NorthernHemisphereMonthlyRepository repository;

    public List<NorthernHemisphereMonthly> findAll() {
        return repository.findAll();
    }

    // Add other methods as needed
}
