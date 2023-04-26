package group_8.climatechangebackend.repositories;

import group_8.climatechangebackend.models.a_gast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface a_gastRepository extends JpaRepository<a_gast, Long> {
}