package com.example.game.controller;

import com.example.game.entity.PlayerItem;
import com.example.game.service.PlayerItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/playerbuyitem")
public class PlayerItemController {
    @Autowired
    private PlayerItemService playerItemService;

    @PostMapping
    public ResponseEntity<Map<String, String>> addPlayerItem(@RequestBody PlayerItem playerItem) {
        boolean status = playerItemService.addPlayerItem(playerItem);
        Map<String, String> response = new HashMap<>();
        response.put("Status", status ? "True" : "False");
        response.put("ErrorCode", status ? "200" : "400");
        return ResponseEntity.ok(response);
    }
}
