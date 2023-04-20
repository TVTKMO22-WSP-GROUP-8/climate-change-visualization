package group_8.climatechangebackend.controllers;

import group_8.climatechangebackend.models.IceCore3;
import group_8.climatechangebackend.services.IceCore3Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ice-core-3")
public class IceCore3Controller {
    @Autowired
    private IceCore3Service service;

    @GetMapping
    public List<IceCore3> getAllIceCore3(){
        return service.findAll();
    }
}
