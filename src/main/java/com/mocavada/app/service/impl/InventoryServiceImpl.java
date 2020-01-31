package com.mocavada.app.service.impl;

import com.mocavada.app.data.repository.InventoryItemRepository;
import com.mocavada.app.domain.Product;
import com.mocavada.app.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class InventoryServiceImpl implements InventoryService {

    private final InventoryItemRepository inventoryItemRepository;

    @Autowired
    public InventoryServiceImpl(InventoryItemRepository inventoryItemRepository) {
        this.inventoryItemRepository = inventoryItemRepository;
    }

    @Override
    public Map<Product, Long> getTotalInventoryOnHand() {
        return null;
    }

    @Override
    public long getQuantityOnHand(String itemId) {
        return 0;
    }

    @Override
    public void adjustInventory(String itemId, long quantity) {

    }
}
