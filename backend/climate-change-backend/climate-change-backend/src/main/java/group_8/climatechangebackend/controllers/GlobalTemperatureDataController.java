package group_8.climatechangebackend.controllers;

import group_8.climatechangebackend.models.GlobalTemperatureData;
import group_8.climatechangebackend.services.GlobalTemperatureDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/global-temperature-data")
public class GlobalTemperatureDataController {
    @Autowired
    private GlobalTemperatureDataService globalTemperatureDataService;

    @GetMapping("/annual")
    public List<GlobalTemperatureData> getAllAnnualData() {
        return globalTemperatureDataService.findAllAnnual();
    }
    
    @GetMapping("/monthly")
    public List<GlobalTemperatureData> getAllMonthlyData() {
        return globalTemperatureDataService.findAllMonthly();
    }
}