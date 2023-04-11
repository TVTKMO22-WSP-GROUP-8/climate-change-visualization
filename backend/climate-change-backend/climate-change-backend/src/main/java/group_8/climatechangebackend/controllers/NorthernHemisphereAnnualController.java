package group_8.climatechangebackend.controllers;

import group_8.climatechangebackend.models.NorthernHemisphereAnnual;
import group_8.climatechangebackend.services.NorthernHemisphereAnnualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/northern-hemisphere-annual")
public class NorthernHemisphereAnnualController {
    @Autowired
    private NorthernHemisphereAnnualService service;

    @GetMapping
    public List<NorthernHemisphereAnnual> getAllNorthernHemisphereAnnual() {
        return service.findAll();
    }
}