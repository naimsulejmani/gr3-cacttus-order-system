package dev.naimsulejmani.gr3cacttusordersystem.controller.api.v1;

import dev.naimsulejmani.gr3cacttusordersystem.dtos.Category;
import dev.naimsulejmani.gr3cacttusordersystem.dtos.ProductDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductRestController {


    @GetMapping
    public List<ProductDto> getAllProducts() {
        return List.of(
                new ProductDto(1, "Laptop", 10, 1000, "RAM 32 GB", Category.ELECTRONICS),
                new ProductDto(2, "T-Shirt", 100, 20, "Size M", Category.CLOTHING),
                new ProductDto(3, "Bread", 50, 5, "Whole Wheat", Category.FOOD)
        );
    }

}
