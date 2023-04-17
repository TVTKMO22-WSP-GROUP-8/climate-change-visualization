package group_8.climatechangebackend.services;
import group_8.climatechangebackend.models.MaunaLoaCO2Annual;
import group_8.climatechangebackend.repositories.MaunaLoaCO2AnnualRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaunaLoaCO2AnnualService {
    @Autowired
    private MaunaLoaCO2AnnualRepository repository;

    public List<MaunaLoaCO2Annual> findAll() {
        return repository.findAll();
    }
}
