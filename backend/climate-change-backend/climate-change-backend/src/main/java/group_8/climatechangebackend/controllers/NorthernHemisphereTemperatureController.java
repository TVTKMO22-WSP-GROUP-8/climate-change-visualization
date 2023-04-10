package group_8.climatechangebackend.controllers;

import group_8.climatechangebackend.models.NorthernHemisphereTemperature;
import group_8.climatechangebackend.services.NorthernHemisphereTemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/northern-hemisphere-temperature")
public class NorthernHemisphereTemperatureController {

    @Autowired
    private NorthernHemisphereTemperatureService service;

    @GetMapping
    public List<NorthernHemisphereTemperature> getAllData() {
        return service.findAll();
    }

    // Add other endpoints as needed
}