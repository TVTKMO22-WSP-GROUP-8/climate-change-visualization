package group_8.climatechangebackend.repositories;

import group_8.climatechangebackend.models.NationalCarbonEmissions2021;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationalCarbonEmissionsRepository extends JpaRepository<NationalCarbonEmissions2021, Long> {
}