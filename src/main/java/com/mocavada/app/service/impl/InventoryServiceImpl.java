package com.mocavada.app.service.impl;

import com.mocavada.app.data.repository.InventoryItemRepository;
import com.mocavada.app.domain.Product;
import com.mocavada.app.service.InventoryService;

import java.util.Map;

public class InventoryServiceImpl implements InventoryService {

    private final InventoryItemRepository inventoryItemRepository;

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
