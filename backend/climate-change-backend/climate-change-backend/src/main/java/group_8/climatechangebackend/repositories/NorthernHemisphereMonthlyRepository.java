package group_8.climatechangebackend.repositories;

import group_8.climatechangebackend.models.NorthernHemisphereMonthly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NorthernHemisphereMonthlyRepository extends JpaRepository<NorthernHemisphereMonthly, Long> {
}
