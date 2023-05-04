package group_8.climatechangebackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group_8.climatechangebackend.models.EmissionsBySubsector;
import group_8.climatechangebackend.repositories.EmissionsBySubsectorRepository;

import java.util.List;

@Service
public class EmissionsBySubsectorService {
    private final EmissionsBySubsectorRepository emissionsBySubsectorRepository;

    @Autowired
    public EmissionsBySubsectorService(EmissionsBySubsectorRepository emissionsBySubsectorRepository) {
        this.emissionsBySubsectorRepository = emissionsBySubsectorRepository;
    }

    public List<EmissionsBySubsector> getAllEmissionsBySubsector() {
        return emissionsBySubsectorRepository.findAllEmissionsBySubsector();
    }
}