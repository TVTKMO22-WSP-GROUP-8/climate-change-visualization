package group_8.climatechangebackend.repositories;

import group_8.climatechangebackend.models.IceCore3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IceCore3Repository extends JpaRepository<IceCore3, Long> {
}