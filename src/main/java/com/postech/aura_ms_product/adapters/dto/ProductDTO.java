package com.postech.aura_ms_product.adapters.dto;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductDTO {
    private Long id;
    private String name;
    private UUID sku;
    private BigDecimal price;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getSku() {
        return sku;
    }

    public void setSku(UUID sku) {
        this.sku = sku;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}