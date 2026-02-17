package com.example.ECommerceSpring.controller;

import com.example.ECommerceSpring.dto.CategoryDTO;
import com.example.ECommerceSpring.service.ICategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public CategoryDTO getCategoryByName(@RequestParam String name){
        return categoryService.getCategoryByName(name);
    }
    @PostMapping()
    public CategoryDTO addCategory(@RequestBody CategoryDTO dto){
        return categoryService.addCategory(dto);
    }

    @GetMapping("/all")
    public List<CategoryDTO> getAllCategories(){
        return categoryService.getAllCategories();
    }
}
