package com.example.game.controller;

import com.example.game.entity.Player;
import com.example.game.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @PostMapping
    public ResponseEntity<Map<String, String>> addPlayer(@RequestBody Player player) {
        boolean status = playerService.addPlayer(player);
        Map<String, String> response = new HashMap<>();
        response.put("Status", status ? "True" : "False");
        response.put("ErrorCode", status ? "200" : "400");
        return ResponseEntity.ok(response);
    }
}
