package com.example.inventory.service;

import com.example.inventory.repository.InventoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    private static final Logger logger = LoggerFactory.getLogger(InventoryService.class);

    @Autowired
    private InventoryRepository inventoryRepository;

    public String checkInventory(String productId) {
        logger.info("Checking inventory for product: {}", productId);
        String status = inventoryRepository.checkInventory(productId) ? "Available" : "Out of Stock";
        return "Inventory status for product " + productId + ": " + status;
    }
}
