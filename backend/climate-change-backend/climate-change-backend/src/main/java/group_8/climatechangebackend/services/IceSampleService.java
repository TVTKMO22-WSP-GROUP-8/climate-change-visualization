package group_8.climatechangebackend.services;

import group_8.climatechangebackend.models.IceSample;
import group_8.climatechangebackend.repositories.IceSampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IceSampleService {

    @Autowired
    private IceSampleRepository iceSampleRepository;

    public List<IceSample> findAll() {
        return iceSampleRepository.findAll();
    }

    public List<IceSample> findBySource(String source) {
        return iceSampleRepository.findAll().stream()
            .filter(sample -> source.equalsIgnoreCase(sample.getSource()))
            .collect(Collectors.toList());
    }
}