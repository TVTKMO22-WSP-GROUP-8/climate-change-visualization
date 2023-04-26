// File name: NorthernHemisphere2000Service.java
package group_8.climatechangebackend.services;

import group_8.climatechangebackend.models.NorthernHemisphere2000;
import group_8.climatechangebackend.repositories.NorthernHemisphere2000Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NorthernHemisphere2000Service {
    @Autowired
    private NorthernHemisphere2000Repository repository;
    
    public List<NorthernHemisphere2000> findAll() {
        return repository.findAll();
    }
    
    public Optional<NorthernHemisphere2000> findById(Long id) {
        return repository.findById(id);
    }
    
    public NorthernHemisphere2000 save(NorthernHemisphere2000 data) {
        return repository.save(data);
    }
    
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}