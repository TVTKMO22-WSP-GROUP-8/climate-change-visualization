package group_8.climatechangebackend.services;

import group_8.climatechangebackend.models.GlobalMonthly;
import group_8.climatechangebackend.repositories.GlobalMonthlyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GlobalMonthlyService {
    @Autowired
    private GlobalMonthlyRepository repository;

    public List<GlobalMonthly> findAll() {
        return repository.findAll();
    }
}