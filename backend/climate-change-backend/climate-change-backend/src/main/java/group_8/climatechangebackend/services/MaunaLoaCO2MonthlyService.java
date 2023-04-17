package group_8.climatechangebackend.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group_8.climatechangebackend.models.MaunaLoaCO2Monthly;
import group_8.climatechangebackend.repositories.MaunaLoaCO2MonthlyRepository;

import java.util.List;

@Service
public class MaunaLoaCO2MonthlyService {
    @Autowired
    private MaunaLoaCO2MonthlyRepository repository;

    public List<MaunaLoaCO2Monthly> findAll() {
        return repository.findAll();
    }
}
