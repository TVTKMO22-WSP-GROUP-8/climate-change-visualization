package group_8.climatechangebackend.repositories;

import group_8.climatechangebackend.models.MaunaLoaCO2Monthly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaunaLoaCO2MonthlyRepository extends JpaRepository<MaunaLoaCO2Monthly, Long> {
}
