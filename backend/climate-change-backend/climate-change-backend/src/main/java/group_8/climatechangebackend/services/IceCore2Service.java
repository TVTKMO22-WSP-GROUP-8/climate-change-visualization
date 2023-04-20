package group_8.climatechangebackend.services;

import org.springframework.beans.factory.annotation.Autowired;

import group_8.climatechangebackend.repositories.IceCore2Repository;
import org.springframework.stereotype.Service;
import group_8.climatechangebackend.models.IceCore2;

import java.util.List;

@Service
public class IceCore2Service {
    @Autowired
    private IceCore2Repository repository;

    public List<IceCore2> findAll() {
        return repository.findAll();
    }
}
