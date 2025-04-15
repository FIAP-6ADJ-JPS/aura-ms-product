package com.postech.aura_ms_product.gateway;
import com.postech.aura_ms_product.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository {
    Product save(Product product);
    Optional<Product> findById(Long id);
    Optional<Product> findBySku(String sku);
    List<Product> findAll();
    void delete(Long id);
    boolean existsById(Long id);
    boolean existsBySku(String sku);
}