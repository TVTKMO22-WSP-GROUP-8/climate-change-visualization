package group_8.climatechangebackend.controllers;

import group_8.climatechangebackend.models.IceCore2;
import group_8.climatechangebackend.services.IceCore2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ice-core-2")
public class IceCore2Controller {
    @Autowired
    private IceCore2Service service;

    @GetMapping
    public List<IceCore2> IceCore2() {
        return service.findAll();
    }
}
