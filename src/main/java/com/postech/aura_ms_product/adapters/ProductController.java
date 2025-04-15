package com.postech.aura_ms_product.adapters;

import com.postech.aura_ms_product.application.CreateProductUseCase;
import com.postech.aura_ms_product.application.FindProductUseCase;
import com.postech.aura_ms_product.domain.Product;
import com.postech.aura_ms_product.adapters.dto.ProductDTO;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final CreateProductUseCase createProductUseCase;
    private final FindProductUseCase findProductUseCase;
    private final ModelMapper modelMapper;

    public ProductController(
            CreateProductUseCase createProductUseCase,
            FindProductUseCase findProductUseCase,
            ModelMapper modelMapper) {
        this.createProductUseCase = createProductUseCase;
        this.findProductUseCase = findProductUseCase;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@Valid @RequestBody ProductDTO productDTO) {
        Product createdProduct = createProductUseCase.execute(productDTO);
        ProductDTO responseDTO = modelMapper.map(createdProduct, ProductDTO.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }

    @GetMapping("/{sku}")
    public ResponseEntity<ProductDTO> getProductBySku(@PathVariable String sku) {
        ProductDTO response = findProductUseCase.findBySku(sku);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> listProducts() {
        List<ProductDTO> response = findProductUseCase.findAll();
        return ResponseEntity.ok(response);
    }

}