package group_8.climatechangebackend.controllers;

import group_8.climatechangebackend.models.SouthernHemisphereAnnual;
import group_8.climatechangebackend.services.SouthernHemisphereAnnualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<SouthernHemisphereAnnual>> getAllData() {
        List<SouthernHemisphereAnnual> data = service.findAll();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

}
