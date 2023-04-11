package group_8.climatechangebackend.repositories;

import group_8.climatechangebackend.models.NorthernHemisphereTemperature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NorthernHemisphereTemperatureRepository extends JpaRepository<NorthernHemisphereTemperature, Long> {
}