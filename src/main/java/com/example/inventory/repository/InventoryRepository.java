package com.example.inventory.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InventoryRepository {
    private Map<String, Boolean> inventory = new HashMap<>();

    public InventoryRepository() {
        inventory.put("product1", true);
        inventory.put("product2", false);
        // Initialize with more products as needed
    }

    public boolean checkInventory(String productId) {
        return inventory.getOrDefault(productId, false);
    }
}
