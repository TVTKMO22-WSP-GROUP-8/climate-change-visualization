package group_8.climatechangebackend.services;

import group_8.climatechangebackend.models.SourceDataFigure;
import group_8.climatechangebackend.repositories.SourceDataFigureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SourceDataFigureService {

    @Autowired
    private SourceDataFigureRepository repository;

    public List<SourceDataFigure> findAll() {
        return repository.findAll();
    }
}
