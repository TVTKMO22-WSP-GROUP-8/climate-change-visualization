package group_8.climatechangebackend.controllers;

import group_8.climatechangebackend.models.GlobalAnnual;
import group_8.climatechangebackend.services.GlobalAnnualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/global-annual")
public class GlobalAnnualController {
    @Autowired
    private GlobalAnnualService service;

    @GetMapping
    public List<GlobalAnnual> getAllGlobalAnnual() {
        return service.findAll();
    }
}