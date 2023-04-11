package group_8.climatechangebackend.services;

import group_8.climatechangebackend.models.GlobalAnnual;
import group_8.climatechangebackend.repositories.GlobalAnnualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GlobalAnnualService {
    @Autowired
    private GlobalAnnualRepository repository;

    public List<GlobalAnnual> findAll() {
        return repository.findAll();
    }
}