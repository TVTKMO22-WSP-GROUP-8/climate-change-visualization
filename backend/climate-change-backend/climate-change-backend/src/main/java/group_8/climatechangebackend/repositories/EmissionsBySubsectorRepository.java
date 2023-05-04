package group_8.climatechangebackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import group_8.climatechangebackend.models.EmissionsBySubsector;

import java.util.List;

public interface EmissionsBySubsectorRepository extends JpaRepository<EmissionsBySubsector, Long> {
    @Query("SELECT e FROM EmissionsBySubsector e")
    List<EmissionsBySubsector> findAllEmissionsBySubsector();
}
