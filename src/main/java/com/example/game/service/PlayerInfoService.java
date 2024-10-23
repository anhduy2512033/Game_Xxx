package com.example.game.service;

import com.example.game.DTO.PlayerInfoDTO;
import com.example.game.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerInfoService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<PlayerInfoDTO> getAllPlayerInfo() {
        return playerRepository.fetchPlayerInfo();
    }
}
