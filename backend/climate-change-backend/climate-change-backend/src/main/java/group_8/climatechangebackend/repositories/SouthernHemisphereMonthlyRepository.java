// File name: SouthernHemisphereMonthlyRepository.java
package group_8.climatechangebackend.repositories;

import group_8.climatechangebackend.models.SouthernHemisphereMonthly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SouthernHemisphereMonthlyRepository extends JpaRepository<SouthernHemisphereMonthly, Long> {
}
