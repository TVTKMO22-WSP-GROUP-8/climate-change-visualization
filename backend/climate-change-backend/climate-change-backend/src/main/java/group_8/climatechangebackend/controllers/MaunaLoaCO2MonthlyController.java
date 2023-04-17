package group_8.climatechangebackend.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import group_8.climatechangebackend.models.MaunaLoaCO2Monthly;
import group_8.climatechangebackend.services.MaunaLoaCO2MonthlyService;

import java.util.List;


@RestController
@RequestMapping("/api/mauna-loa-co2-monthly")
public class MaunaLoaCO2MonthlyController {
    @Autowired
    private MaunaLoaCO2MonthlyService service;

    @GetMapping
    private List<MaunaLoaCO2Monthly> getAllMaunaLoaCO2Monthly(){
        return service.findAll();
    }
}
