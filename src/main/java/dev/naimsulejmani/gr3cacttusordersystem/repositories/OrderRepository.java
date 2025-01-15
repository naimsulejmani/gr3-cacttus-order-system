package dev.naimsulejmani.gr3cacttusordersystem.repositories;

import dev.naimsulejmani.gr3cacttusordersystem.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
