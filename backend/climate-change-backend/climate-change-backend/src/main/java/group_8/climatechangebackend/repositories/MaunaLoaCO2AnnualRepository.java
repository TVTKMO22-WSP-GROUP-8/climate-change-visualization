package group_8.climatechangebackend.repositories;


import group_8.climatechangebackend.models.MaunaLoaCO2Annual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaunaLoaCO2AnnualRepository extends JpaRepository<MaunaLoaCO2Annual, Long> {
}
