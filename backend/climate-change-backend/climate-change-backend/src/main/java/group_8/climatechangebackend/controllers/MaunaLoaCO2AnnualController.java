// File name: MaunaLoaCO2AnnualController.java
package group_8.climatechangebackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import group_8.climatechangebackend.models.MaunaLoaCO2Annual;
import group_8.climatechangebackend.services.MaunaLoaCO2AnnualService;

import java.util.List;


@RestController
@RequestMapping("/api/mauna-loa-co2-annual")
public class MaunaLoaCO2AnnualController {
    @Autowired
    private MaunaLoaCO2AnnualService service;

    @GetMapping
    public List<MaunaLoaCO2Annual> getAllMaunaLoaCO2Annual() {
        return service.findAll();
    }
}
