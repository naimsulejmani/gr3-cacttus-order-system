package dev.naimsulejmani.gr3cacttusordersystem.repositories;

import dev.naimsulejmani.gr3cacttusordersystem.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
