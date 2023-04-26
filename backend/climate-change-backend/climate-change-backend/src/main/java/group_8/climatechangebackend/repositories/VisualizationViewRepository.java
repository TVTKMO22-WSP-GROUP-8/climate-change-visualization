// File name: VisualizationViewRepository.java
package group_8.climatechangebackend.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import group_8.climatechangebackend.models.User;
import group_8.climatechangebackend.models.VisualizationView;

@Repository
public interface VisualizationViewRepository extends JpaRepository<VisualizationView, Integer> {
    @Query("SELECT v FROM VisualizationView v JOIN FETCH v.datasets WHERE v.user.id = :userId")
    List<VisualizationView> findByUserIdWithDatasets(@Param("userId") Integer userId);
    List<VisualizationView> findByUser(User user);
}