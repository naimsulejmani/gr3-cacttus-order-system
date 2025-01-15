package dev.naimsulejmani.gr3cacttusordersystem.entities;

import dev.naimsulejmani.gr3cacttusordersystem.dtos.Category;
import dev.naimsulejmani.gr3cacttusordersystem.dtos.ProductDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "products")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true, length = 50)
    private String name;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private double price;

    @Column(length = 4000)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false,length = 20)
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<OrderDetailEntity> orderDetails;
}















