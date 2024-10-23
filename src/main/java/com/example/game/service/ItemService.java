package com.example.game.service;

import com.example.game.entity.Item;
import com.example.game.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public boolean addItem(Item item) {
        itemRepository.save(item);
        return true;
    }
}
