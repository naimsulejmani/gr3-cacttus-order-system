package dev.naimsulejmani.gr3cacttusordersystem.repositories.data_initializer;

import dev.naimsulejmani.gr3cacttusordersystem.dtos.Category;
import dev.naimsulejmani.gr3cacttusordersystem.entities.ProductEntity;
import dev.naimsulejmani.gr3cacttusordersystem.repositories.ProductRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProductInitializer implements Runnable {
    private final ProductRepository repository;

    @Override
    public void run() {

        if (repository.count() > 0) return;


        ProductEntity p1 = new ProductEntity(0, "Product 1", 100, 2.0, "Description 1", Category.FOOD, null);
        ProductEntity p2 = new ProductEntity(0, "Product 2", 200, 2.5, "Description 2", Category.FOOD, null);
        ProductEntity p3 = new ProductEntity(0, "Product 3", 300, 3.5, "Description 2", Category.FOOD, null);

        repository.save(p1);
        repository.save(p2);
        repository.save(p3);

//        repository.saveAll(List.of(p1,p2,p3));

    }
}









