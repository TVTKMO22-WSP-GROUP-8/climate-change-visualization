package group_8.climatechangebackend.services;
import group_8.climatechangebackend.models.GlobalTemperatureData;
import group_8.climatechangebackend.repositories.GlobalTemperatureDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GlobalTemperatureDataService {
    @Autowired
    private GlobalTemperatureDataRepository globalTemperatureDataRepository;

    public List<GlobalTemperatureData> findAll() {
        return globalTemperatureDataRepository.findAll();
    }

    public List<GlobalTemperatureData> findAllAnnual() {
        return globalTemperatureDataRepository.findAllAnnual();
    }

    public List<GlobalTemperatureData> findAllMonthly() {
        return globalTemperatureDataRepository.findAllMonthly();
    }
}