package com.example.inventory.controller;

import com.example.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/inventory/{productId}")
    public String checkInventory(@PathVariable String productId) {
        return inventoryService.checkInventory(productId);
    }
}