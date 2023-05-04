// File name: IceSamplesService.java
package group_8.climatechangebackend.services;

import group_8.climatechangebackend.models.DSS;
import group_8.climatechangebackend.repositories.DSSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DSSService {
    @Autowired
    private DSSRepository repository;

    public List<DSS> findAll() {
        return repository.findAll();
    }
}
