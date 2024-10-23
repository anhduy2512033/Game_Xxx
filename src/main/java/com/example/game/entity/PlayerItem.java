package com.example.game.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "player_item_t")
public class PlayerItem {
    @EmbeddedId
    private PlayerItemId id;

    // Additional fields, getters, and setters

    public PlayerItemId getId() {
        return id;
    }

    public void setId(PlayerItemId id) {
        this.id = id;
    }
}
