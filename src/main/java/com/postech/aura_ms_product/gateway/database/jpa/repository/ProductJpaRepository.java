package com.postech.aura_ms_product.gateway.database.jpa.repository;

import com.postech.aura_ms_product.gateway.database.jpa.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductJpaRepository extends JpaRepository<ProductEntity, Long> {
    Optional<ProductEntity> findBySku(String sku);
    boolean existsBySku(String sku);
}
