// File name: NorthernHemisphere2000Repository.java
package group_8.climatechangebackend.repositories;

import group_8.climatechangebackend.models.NorthernHemisphere2000;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NorthernHemisphere2000Repository extends JpaRepository<NorthernHemisphere2000, Long> {
}