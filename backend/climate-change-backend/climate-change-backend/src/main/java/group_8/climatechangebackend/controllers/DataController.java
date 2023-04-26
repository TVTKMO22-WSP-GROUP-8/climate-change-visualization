package group_8.climatechangebackend.controllers;

import group_8.climatechangebackend.models.Dataset;
import group_8.climatechangebackend.repositories.DatasetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class DataController {

    @Autowired
    private DatasetRepository datasetRepository;

    @GetMapping
    public ResponseEntity<?> getData() {
        List<Dataset> datasets = datasetRepository.findAll();
        return new ResponseEntity<>(datasets, HttpStatus.OK);
    }
}
