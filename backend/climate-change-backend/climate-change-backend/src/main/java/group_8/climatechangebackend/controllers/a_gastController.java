package group_8.climatechangebackend.controllers;

import group_8.climatechangebackend.models.a_gast;
import group_8.climatechangebackend.services.a_gastService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/a-gast")
public class a_gastController {

    @Autowired
    private a_gastService service;

    @GetMapping
    public List<a_gast> getAlla_gast() {
       
        return service.findAll();
    }

}

