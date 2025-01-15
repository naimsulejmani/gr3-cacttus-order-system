package dev.naimsulejmani.gr3cacttusordersystem.dtos;

import dev.naimsulejmani.gr3cacttusordersystem.entities.OrderDetailEntity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private long id;
    private String name;
    private int quantity;
    private double price;
    private String description;
    private Category category;



}










