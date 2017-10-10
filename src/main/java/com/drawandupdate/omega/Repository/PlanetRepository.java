package com.drawandupdate.omega.Repository;

import com.drawandupdate.omega.entities.Game;
import com.drawandupdate.omega.entities.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, Long> {
    List<Planet> findAllByGame(Game game);
}
