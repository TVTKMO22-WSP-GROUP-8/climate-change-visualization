// File name: GlobalAnnualRepository.java
package group_8.climatechangebackend.repositories;

import group_8.climatechangebackend.models.GlobalAnnual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalAnnualRepository extends JpaRepository<GlobalAnnual, Long> {
}