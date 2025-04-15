package com.postech.aura_ms_product.application;

import com.postech.aura_ms_product.config.exception.ProductNotFoundException;
import com.postech.aura_ms_product.domain.Product;
import com.postech.aura_ms_product.adapters.dto.ProductDTO;
import com.postech.aura_ms_product.gateway.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FindProductUseCase {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    public FindProductUseCase(ProductRepository productRepository, ModelMapper modelMapper) {
        this.productRepository = productRepository;
        this.modelMapper = modelMapper;
    }

    public ProductDTO findBySku(String sku) {
        Product product = productRepository.findBySku(sku)
                .orElseThrow(() -> new ProductNotFoundException("Produto não encontrado com SKU: " + sku));

        return modelMapper.map(product, ProductDTO.class);
    }

    public List<ProductDTO> findAll() {
        return productRepository.findAll().stream()
                .map(product -> modelMapper.map(product, ProductDTO.class))
                .collect(Collectors.toList());
    }

    public ProductDTO findById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Produto não encontrado com ID: " + id));

        return modelMapper.map(product, ProductDTO.class);
    }
}