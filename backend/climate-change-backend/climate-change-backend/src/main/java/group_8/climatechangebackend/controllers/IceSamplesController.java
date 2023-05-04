package group_8.climatechangebackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import group_8.climatechangebackend.models.CombinedIceSampleData;
import group_8.climatechangebackend.models.DE08;
import group_8.climatechangebackend.models.DSS;
import group_8.climatechangebackend.models.DE08_2;
import group_8.climatechangebackend.services.DE08Service;
import group_8.climatechangebackend.services.DSSService;
import group_8.climatechangebackend.services.DE08_2Service;

import java.util.List;

@RestController
@RequestMapping("/api/ice-samples")
public class IceSamplesController {

    @Autowired
    private DE08Service de08Service;

    @Autowired
    private DSSService dssService;

    @Autowired
    private DE08_2Service de08_2Service;

    @GetMapping
    public CombinedIceSampleData getAllIceSampleData() {
        CombinedIceSampleData combinedData = new CombinedIceSampleData();
        combinedData.setDe08(de08Service.findAll());
        combinedData.setDss(dssService.findAll());
        combinedData.setDe08_2(de08_2Service.findAll());
        return combinedData;
    }
}


    //@GetMapping("/de08")
    //public List<DE08> getAllDE08() {
    //    return de08Service.findAll();
    //}

    //@GetMapping("/dss")
    //public List<DSS> getAllDSS() {
    //    return dssService.findAll();
    //}

    //@GetMapping("/de08_2")
    //public List<DE08_2> getAllDE08_2() {
    //    return de08_2Service.findAll();
    //}

