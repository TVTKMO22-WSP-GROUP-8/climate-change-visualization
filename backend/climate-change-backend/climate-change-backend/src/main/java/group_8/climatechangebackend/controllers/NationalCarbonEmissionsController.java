package group_8.climatechangebackend.controllers;

import group_8.climatechangebackend.models.GlobalMonthly;
import group_8.climatechangebackend.services.GlobalMonthlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/National_Carbon_Emissions")

public class NationalCarbonEmissionsController {
    @Autowired
    private GlobalMonthlyService service;

    @GetMapping
    public List<GlobalMonthly> getAllGlobalMonthly() {
        return service.findAll(); 
}
}