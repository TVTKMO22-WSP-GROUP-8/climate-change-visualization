package group_8.climatechangebackend.services;

import org.springframework.beans.factory.annotation.Autowired;

import group_8.climatechangebackend.repositories.IceCore1Repository;
import org.springframework.stereotype.Service;
import group_8.climatechangebackend.models.IceCore1;

import java.util.List;

@Service
public class IceCore1Service {
    @Autowired
    private IceCore1Repository repository;

    public List<IceCore1> findAll() {
        return repository.findAll();
    }
}
