package group_8.climatechangebackend.repositories;

import group_8.climatechangebackend.models.IceCore2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IceCore2Repository extends JpaRepository<IceCore2, Long> {
}