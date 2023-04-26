// File name: NorthernHemisphereMonthlyRepository.java
package group_8.climatechangebackend.repositories;

import group_8.climatechangebackend.models.SouthernHemisphereAnnual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SouthernHemisphereAnnualRepository extends JpaRepository<SouthernHemisphereAnnual, Long> {
}