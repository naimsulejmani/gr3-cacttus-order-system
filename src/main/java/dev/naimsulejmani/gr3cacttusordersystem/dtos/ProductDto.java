package dev.naimsulejmani.gr3cacttusordersystem.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
