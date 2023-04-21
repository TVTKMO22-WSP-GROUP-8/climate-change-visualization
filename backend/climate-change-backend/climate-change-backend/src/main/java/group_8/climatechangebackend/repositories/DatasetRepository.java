package group_8.climatechangebackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import group_8.climatechangebackend.models.Dataset;

@Repository
public interface DatasetRepository extends JpaRepository<Dataset, Integer> {
}