package group_8.climatechangebackend.repositories;

import group_8.climatechangebackend.models.SouthernHemisphereTemperature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SouthernHemisphereTemperatureRepository extends JpaRepository<SouthernHemisphereTemperature, Long> {
}