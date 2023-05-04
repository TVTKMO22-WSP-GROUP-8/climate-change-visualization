package group_8.climatechangebackend.controllers;

import group_8.climatechangebackend.services.NationalCarbonEmissionsService;
import group_8.climatechangebackend.models.NationalCarbonEmissions2021;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/National_Carbon_Emissions")

public class NationalCarbonEmissionsController {
    @Autowired
    private NationalCarbonEmissionsService service;

    @GetMapping
    public List<NationalCarbonEmissionsService> getAllNationalCarbonEmissions() {
        return service.findAll(); 
}
}