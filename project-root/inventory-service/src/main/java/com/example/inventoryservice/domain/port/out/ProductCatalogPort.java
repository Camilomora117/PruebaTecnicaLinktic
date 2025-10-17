package com.example.inventoryservice.domain.port.out;

import com.example.inventoryservice.domain.model.ProductView;

public interface ProductCatalogPort {
    
    ProductView getById(Long productId);
}
