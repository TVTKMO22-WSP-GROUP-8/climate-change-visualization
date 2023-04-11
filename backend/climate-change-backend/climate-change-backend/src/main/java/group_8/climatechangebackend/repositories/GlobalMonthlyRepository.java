package group_8.climatechangebackend.repositories;

import group_8.climatechangebackend.models.GlobalMonthly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalMonthlyRepository extends JpaRepository<GlobalMonthly, Long> {
}