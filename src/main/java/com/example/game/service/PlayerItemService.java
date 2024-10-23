package com.example.game.service;

import com.example.game.entity.PlayerItem;
import com.example.game.repository.PlayerItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerItemService {
    @Autowired
    private PlayerItemRepository playerItemRepository;

    public boolean addPlayerItem(PlayerItem playerItem) {
        playerItemRepository.save(playerItem);
        return true;
    }
}
