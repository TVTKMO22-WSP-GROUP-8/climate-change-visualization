// File name: SourceDataFigureController.java
package group_8.climatechangebackend.controllers;

import group_8.climatechangebackend.models.SourceDataFigure;
import group_8.climatechangebackend.services.SourceDataFigureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/source-data-figure")
public class SourceDataFigureController {
@Autowired
private SourceDataFigureService service;
@GetMapping
public List<SourceDataFigure> getAllSourceDataFigure() {
    return service.findAll();
}
}