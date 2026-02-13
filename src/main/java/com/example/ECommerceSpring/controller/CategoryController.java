package com.example.ECommerceSpring.controller;

import com.example.ECommerceSpring.dto.CategoryDTO;
import com.example.ECommerceSpring.service.ICategoryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    private final ICategoryService categoryService;
    public CategoryController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/{id}")
    public CategoryDTO getCategoryById (@PathVariable Long id){
        return categoryService.getCategoryById(id);
    }

    @PostMapping()
    public CategoryDTO addCategory(@RequestBody CategoryDTO dto){
        return categoryService.addCategory(dto);
    }
}
