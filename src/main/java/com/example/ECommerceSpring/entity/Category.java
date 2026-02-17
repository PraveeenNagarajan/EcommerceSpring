package com.example.ECommerceSpring.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Service;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category extends BaseEntity{
    @Column(nullable = false,unique = true)
    private String name;
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
