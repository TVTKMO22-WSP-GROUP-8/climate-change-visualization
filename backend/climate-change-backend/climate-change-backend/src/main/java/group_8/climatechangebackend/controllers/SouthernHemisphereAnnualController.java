package group_8.climatechangebackend.controllers;

import group_8.climatechangebackend.models.SouthernHemisphereAnnual;
import group_8.climatechangebackend.services.SouthernHemisphereAnnualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/southern-hemisphere-annual")
public class SouthernHemisphereAnnualController {

    @Autowired
    private SouthernHemisphereAnnualService service;

    @GetMapping
    public List<SouthernHemisphereAnnual> getAllData() {
        return service.findAll();
    }

    // Add other endpoints as needed
    @GetMapping("/annual")
    public List<SouthernHemisphereAnnual> getAllAnnualData() {
        return service.findAll();
    }
}