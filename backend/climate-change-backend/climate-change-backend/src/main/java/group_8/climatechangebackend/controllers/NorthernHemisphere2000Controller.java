// File name: NorthernHemisphere2000Controller.java
package group_8.climatechangebackend.controllers;

import group_8.climatechangebackend.models.NorthernHemisphere2000;
import group_8.climatechangebackend.services.NorthernHemisphere2000Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/northern-hemisphere-2000")
public class NorthernHemisphere2000Controller {
    @Autowired
    private NorthernHemisphere2000Service service;

    @GetMapping
    public List<NorthernHemisphere2000> getAllNorthernHemisphere2000() {
        return service.findAll();
    }
}