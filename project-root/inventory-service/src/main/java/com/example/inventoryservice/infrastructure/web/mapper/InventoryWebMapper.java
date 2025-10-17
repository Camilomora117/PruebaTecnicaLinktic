package com.example.inventoryservice.infrastructure.web.mapper;

import com.example.inventoryservice.domain.model.Inventory;
import com.example.inventoryservice.domain.model.InventoryWithProduct;
import com.example.inventoryservice.domain.model.Product;
import com.example.inventoryservice.infrastructure.web.dto.InventoryRequest;
import com.example.inventoryservice.infrastructure.web.dto.InventoryResponse;

/**
 * Mapper for converting between domain models and DTOs for inventory operations.
 */
public class InventoryWebMapper {

    public static Inventory toDomain(InventoryRequest request, Long productId) {
        if (request == null) {
            return null;
        }
        return new Inventory(productId, request.getQuantity());
    }

    public static InventoryResponse toResponse(Inventory inventory) {
        if (inventory == null) {
            return null;
        }
        return new InventoryResponse(inventory.getProductId(), inventory.getQuantity());
    }
}

