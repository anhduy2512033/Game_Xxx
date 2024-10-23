package com.example.game.repository;

import com.example.game.entity.PlayerItem;
import com.example.game.entity.PlayerItemId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerItemRepository extends JpaRepository<PlayerItem, PlayerItemId> {
}
