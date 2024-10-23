package com.example.game.repository;

import com.example.game.DTO.PlayerInfoDTO;
import com.example.game.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
    @Query("SELECT p FROM Player p WHERE p.playerId = ?1")
    List<PlayerInfoDTO> fetchPlayerInfo();
}