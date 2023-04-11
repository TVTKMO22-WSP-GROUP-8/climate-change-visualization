package group_8.climatechangebackend.repositories;
import group_8.climatechangebackend.models.GlobalTemperatureData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
@Repository
public interface GlobalTemperatureDataRepository extends JpaRepository<GlobalTemperatureData, Long> {
    @Query("SELECT g FROM GlobalTemperatureData g WHERE g.frequency = 'annual'")
    List<GlobalTemperatureData> findAllAnnual();

    @Query("SELECT g FROM GlobalTemperatureData g WHERE g.frequency = 'monthly'")
    List<GlobalTemperatureData> findAllMonthly();
}