package group_8.climatechangebackend.services;

import group_8.climatechangebackend.models.NorthernHemisphereAnnual;
import group_8.climatechangebackend.repositories.NorthernHemisphereAnnualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NorthernHemisphereAnnualService {
    @Autowired
    private NorthernHemisphereAnnualRepository repository;

    public List<NorthernHemisphereAnnual> findAll() {
        return repository.findAll();
    }
}