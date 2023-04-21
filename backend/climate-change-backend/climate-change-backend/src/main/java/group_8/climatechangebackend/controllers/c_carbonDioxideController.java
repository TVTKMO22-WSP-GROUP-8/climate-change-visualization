package group_8.climatechangebackend.controllers;

import group_8.climatechangebackend.models.c_carbonDioxide;
import group_8.climatechangebackend.services.c_carbonDioxideService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/c-carbon-dioxide")
public class c_carbonDioxideController {

    @Autowired
    private c_carbonDioxideService service;

    @GetMapping
    public List<c_carbonDioxide> getAllc_carbonDioxide() {
       
       return service.findAll();
    }

}
