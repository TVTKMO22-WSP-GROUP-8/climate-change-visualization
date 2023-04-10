package group_8.climatechangebackend.services;

// NorthernHemisphere2000Service.java

import group_8.climatechangebackend.models.NorthernHemisphere2000;
import group_8.climatechangebackend.repositories.NorthernHemisphere2000Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NorthernHemisphere2000Service {
    @Autowired
    private NorthernHemisphere2000Repository repository;

    public List<NorthernHemisphere2000> findAll() {
        return repository.findAll();
    }
}