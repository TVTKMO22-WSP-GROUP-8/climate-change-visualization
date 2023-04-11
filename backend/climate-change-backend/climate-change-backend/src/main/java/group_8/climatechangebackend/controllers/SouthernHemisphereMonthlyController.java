package group_8.climatechangebackend.controllers;

import group_8.climatechangebackend.models.SouthernHemisphereMonthly;
import group_8.climatechangebackend.services.SouthernHemisphereMonthlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/southern-hemisphere-monthly")
public class SouthernHemisphereMonthlyController {

    @Autowired
    private SouthernHemisphereMonthlyService service;

    @GetMapping
    public List<SouthernHemisphereMonthly> getAllData() {
        return service.findAll();
    }

    // Add other endpoints as needed
    @GetMapping("/monthly")
    public List<SouthernHemisphereMonthly> getAllMonthlyData() {
        return service.findAll();
    }
}
