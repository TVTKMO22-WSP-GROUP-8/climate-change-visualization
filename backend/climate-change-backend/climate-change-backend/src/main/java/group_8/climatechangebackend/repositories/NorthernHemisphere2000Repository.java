package group_8.climatechangebackend.repositories;
// NorthernHemisphere2000Repository.java
import group_8.climatechangebackend.models.NorthernHemisphere2000;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NorthernHemisphere2000Repository extends JpaRepository<NorthernHemisphere2000, Long> {
}
