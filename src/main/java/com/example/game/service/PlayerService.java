package com.example.game.service;

import com.example.game.entity.Player;
import com.example.game.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public boolean addPlayer(Player player) {
        playerRepository.save(player);
        return true;
    }
}
