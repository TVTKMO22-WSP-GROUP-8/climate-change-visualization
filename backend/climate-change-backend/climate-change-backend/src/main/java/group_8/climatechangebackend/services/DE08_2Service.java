// File name: DE08_2Service.java
package group_8.climatechangebackend.services;

import group_8.climatechangebackend.models.DE08_2;
import group_8.climatechangebackend.repositories.DE08_2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DE08_2Service {
    @Autowired
    private DE08_2Repository repository;

    public List<DE08_2> findAll() {
        return repository.findAll();
    }
}
