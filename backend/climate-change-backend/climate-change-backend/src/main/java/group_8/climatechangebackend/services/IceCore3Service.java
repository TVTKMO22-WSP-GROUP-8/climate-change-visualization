package group_8.climatechangebackend.services;

import org.springframework.beans.factory.annotation.Autowired;

import group_8.climatechangebackend.repositories.IceCore3Repository;
import org.springframework.stereotype.Service;
import group_8.climatechangebackend.models.IceCore3;

import java.util.List;

@Service
public class IceCore3Service {
    @Autowired
    private IceCore3Repository repository;

    public List<IceCore3> findAll() {
        return repository.findAll();
    }
}
