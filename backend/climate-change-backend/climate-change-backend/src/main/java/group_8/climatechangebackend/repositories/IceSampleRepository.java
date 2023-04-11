package group_8.climatechangebackend.repositories;

import group_8.climatechangebackend.models.IceSample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IceSampleRepository extends JpaRepository<IceSample, Long> {
}