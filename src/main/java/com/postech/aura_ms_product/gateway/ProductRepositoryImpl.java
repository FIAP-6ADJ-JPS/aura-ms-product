package com.postech.aura_ms_product.gateway;


import com.postech.aura_ms_product.domain.Product;
import com.postech.aura_ms_product.gateway.database.jpa.entity.ProductEntity;
import com.postech.aura_ms_product.gateway.database.jpa.repository.ProductJpaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class ProductRepositoryImpl implements ProductRepository {

    private final ProductJpaRepository productJpaRepository;
    private final ModelMapper modelMapper;

    public ProductRepositoryImpl(ProductJpaRepository productJpaRepository, ModelMapper modelMapper) {
        this.productJpaRepository = productJpaRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Product save(Product product) {
        ProductEntity entity = modelMapper.map(product, ProductEntity.class);
        ProductEntity savedEntity = productJpaRepository.save(entity);
        return modelMapper.map(savedEntity, Product.class);
    }

    @Override
    public Optional<Product> findBySku(String sku) {
        return productJpaRepository.findBySku(sku)
                .map(entity -> modelMapper.map(entity, Product.class));
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productJpaRepository.findById(id)
                .map(entity -> modelMapper.map(entity, Product.class));
    }

    @Override
    public List<Product> findAll() {
        return productJpaRepository.findAll().stream()
                .map(entity -> modelMapper.map(entity, Product.class))
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        productJpaRepository.deleteById(id);
    }

    @Override
    public boolean existsById(Long id){
        return productJpaRepository.existsById(id);
    }

    @Override
    public boolean existsBySku(String sku) {
        return productJpaRepository.existsBySku(sku);
    }

}