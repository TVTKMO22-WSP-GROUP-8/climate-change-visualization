package group_8.climatechangebackend.repositories;
import group_8.climatechangebackend.models.DSS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DSSRepository extends JpaRepository<DSS, Long> {
    
}