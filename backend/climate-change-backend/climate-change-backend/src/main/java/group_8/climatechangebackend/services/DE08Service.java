// File name: IceSamplesService.java
package group_8.climatechangebackend.services;

import group_8.climatechangebackend.models.DE08;
import group_8.climatechangebackend.repositories.DE08Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DE08Service {
    @Autowired
    private DE08Repository repository;

    public List<DE08> findAll() {
        return repository.findAll();
    }
}
