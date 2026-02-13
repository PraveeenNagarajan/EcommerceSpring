package com.example.ECommerceSpring.dto;

import jakarta.persistence.GeneratedValue;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {
    private String name;
    private String brand;
    private int price;
    private Long categoryId;
}
