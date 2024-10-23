package com.example.game.entity;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PlayerItemId implements Serializable {
    private String itemId;
    private Integer playerId;

    public PlayerItemId() {}

    public PlayerItemId(String itemId, Integer playerId) {
        this.itemId = itemId;
        this.playerId = playerId;
    }

    // Getters and Setters

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayerItemId)) return false;
        PlayerItemId that = (PlayerItemId) o;
        return Objects.equals(itemId, that.itemId) &&
                Objects.equals(playerId, that.playerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, playerId);
    }
}
