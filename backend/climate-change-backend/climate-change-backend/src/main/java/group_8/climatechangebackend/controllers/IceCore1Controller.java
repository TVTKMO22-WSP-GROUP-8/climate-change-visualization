package group_8.climatechangebackend.controllers;

import group_8.climatechangebackend.models.IceCore1;
import group_8.climatechangebackend.services.IceCore1Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ice-core-1")
public class IceCore1Controller {
    @Autowired
    private IceCore1Service service;

    @GetMapping
    public List<IceCore1> getAllIceCore1(){
        return service.findAll();
    }
}
