package group_8.climatechangebackend.controllers;

import group_8.climatechangebackend.models.IceSample;
import group_8.climatechangebackend.services.IceSampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ice-samples")
public class IceSampleController {

    @Autowired
    private IceSampleService iceSampleService;

    @GetMapping
    public List<IceSample> getAllIceSamples(@RequestParam(required = false) String source) {
        if (source != null && !source.isEmpty()) {
            return iceSampleService.findBySource(source);
        } else {
            return iceSampleService.findAll();
        }
    }
}