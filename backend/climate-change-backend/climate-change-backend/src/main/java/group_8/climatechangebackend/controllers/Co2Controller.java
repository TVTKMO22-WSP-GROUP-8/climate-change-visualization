// Co2Controller.java
package group_8.climatechangebackend.controllers;

import group_8.climatechangebackend.models.MaunaLoaCO2Annual;
import group_8.climatechangebackend.models.MaunaLoaCO2Monthly;
import group_8.climatechangebackend.repositories.MaunaLoaCO2AnnualRepository;
import group_8.climatechangebackend.repositories.MaunaLoaCO2MonthlyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/co2")
public class Co2Controller {

    @Autowired
    private MaunaLoaCO2AnnualRepository maunaLoaCO2AnnualRepository;

    @Autowired
    private MaunaLoaCO2MonthlyRepository maunaLoaCO2MonthlyRepository;

    @GetMapping("/annual")
    public List<MaunaLoaCO2Annual> getAnnualCo2Data() {
        return maunaLoaCO2AnnualRepository.findAll();
    }

    @GetMapping("/monthly")
    public List<MaunaLoaCO2Monthly> getMonthlyCo2Data() {
        return maunaLoaCO2MonthlyRepository.findAll();
    }
}
