package com.drawandupdate.omega.Repository;

import com.drawandupdate.omega.entities.Fleet;
import com.drawandupdate.omega.entities.Game;
import com.drawandupdate.omega.entities.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FleetRepository extends JpaRepository<Fleet, Long> {
    List<Fleet> findAllByGame(Game game);
}
