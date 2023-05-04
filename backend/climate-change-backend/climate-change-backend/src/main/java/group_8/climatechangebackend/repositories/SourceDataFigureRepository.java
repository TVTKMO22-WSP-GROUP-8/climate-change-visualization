package group_8.climatechangebackend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import group_8.climatechangebackend.models.SourceDataFigure;

@Repository
public interface SourceDataFigureRepository extends JpaRepository<SourceDataFigure, Long> {
    List<SourceDataFigure> findByOrderByTimeAsc();
}

