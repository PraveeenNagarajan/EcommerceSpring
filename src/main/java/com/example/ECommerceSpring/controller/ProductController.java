package com.example.ECommerceSpring.controller;

import com.example.ECommerceSpring.dto.ProductDTO;
import com.example.ECommerceSpring.service.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    private final IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProducts(){
        List<ProductDTO>result = productService.getAllProducts();
        return ResponseEntity.ok(result);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductbyId(@PathVariable Long id) throws Exception {
        ProductDTO result = this.productService.getProductById(id);
        return ResponseEntity.ok(result);
    }

    @PostMapping()
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO dto){
        return ResponseEntity.ok(productService.createProduct(dto));
    }

    @GetMapping("/range")
    public ResponseEntity<List<ProductDTO>> rangeQuery(@RequestParam double min, @RequestParam double max){
        return ResponseEntity.ok(productService.rangeQuery(min,max));
    }
}
