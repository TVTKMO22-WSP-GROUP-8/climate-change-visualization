package group_8.climatechangebackend.controllers;

import group_8.climatechangebackend.models.NorthernHemisphereMonthly;
import group_8.climatechangebackend.services.NorthernHemisphereMonthlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/northern-hemisphere-monthly")
public class NorthernHemisphereMonthlyController {

    @Autowired
    private NorthernHemisphereMonthlyService service;

    @GetMapping
    public List<NorthernHemisphereMonthly> getAllData() {
        return service.findAll();
    }

    // Add other endpoints as needed
}
