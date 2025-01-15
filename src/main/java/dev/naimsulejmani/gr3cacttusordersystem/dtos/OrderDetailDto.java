package dev.naimsulejmani.gr3cacttusordersystem.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailDto {
    private long id;
    private ProductDto product;
    private int quantity;
    private double price;
    private double discount;
    private double total;
}
















