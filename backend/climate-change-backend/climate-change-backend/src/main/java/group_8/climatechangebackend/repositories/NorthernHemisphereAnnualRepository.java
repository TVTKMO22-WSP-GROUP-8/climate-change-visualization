package group_8.climatechangebackend.repositories;

import group_8.climatechangebackend.models.NorthernHemisphereAnnual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NorthernHemisphereAnnualRepository extends JpaRepository<NorthernHemisphereAnnual, Long> {
}