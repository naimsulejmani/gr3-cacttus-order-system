package dev.naimsulejmani.gr3cacttusordersystem.repositories;

import dev.naimsulejmani.gr3cacttusordersystem.entities.OrderDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity, Long> {
}
