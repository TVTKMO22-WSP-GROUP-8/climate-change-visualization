package group_8.climatechangebackend.repositories;

import group_8.climatechangebackend.models.c_carbonDioxide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface c_carbonDioxideRepository extends JpaRepository<c_carbonDioxide, Long> {
}