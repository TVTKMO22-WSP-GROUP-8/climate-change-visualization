package group_8.climatechangebackend.controllers;

import group_8.climatechangebackend.models.SouthernHemisphereTemperature;
import group_8.climatechangebackend.services.SouthernHemisphereTemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/southern-hemisphere-temperatures")
public class SouthernHemisphereTemperatureController {

    @Autowired
    private SouthernHemisphereTemperatureService service;

    @GetMapping
    public List<SouthernHemisphereTemperature> getAllSouthernHemisphereTemperatures() {
        return service.findAll();
    }

    // Add other CRUD operations here as needed
}