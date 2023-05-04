package group_8.climatechangebackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group_8.climatechangebackend.models.EmissionsBySubsector;
import group_8.climatechangebackend.services.EmissionsBySubsectorService;

import java.util.List;

@RestController
@RequestMapping("/api/emissions_by_subsector")
public class EmissionsBySubsectorController {
    private final EmissionsBySubsectorService emissionsBySubsectorService;

    @Autowired
    public EmissionsBySubsectorController(EmissionsBySubsectorService emissionsBySubsectorService) {
        this.emissionsBySubsectorService = emissionsBySubsectorService;
    }

    @GetMapping
    public List<EmissionsBySubsector> getAllEmissionsBySubsector() {
        return emissionsBySubsectorService.getAllEmissionsBySubsector();
    }
}
