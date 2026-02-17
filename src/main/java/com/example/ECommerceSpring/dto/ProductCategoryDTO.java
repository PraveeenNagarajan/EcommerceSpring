package com.example.ECommerceSpring.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductCategoryDTO {
    private String name;
    private String brand;
    private int price;
    private CategoryDTO category;
}
