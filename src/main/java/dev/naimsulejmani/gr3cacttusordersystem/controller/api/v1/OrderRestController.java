package dev.naimsulejmani.gr3cacttusordersystem.controller.api.v1;

import dev.naimsulejmani.gr3cacttusordersystem.dtos.OrderDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderRestController {

    @GetMapping
    public List<OrderDto> getOrders() {
        return List.of();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDto> getOrderById(long id) {
        return ResponseEntity.ok(new OrderDto());
    }

    @PostMapping
    public ResponseEntity<OrderDto> createOrder(@RequestBody OrderDto order) {
        return ResponseEntity.status(HttpStatus.CREATED).body(order);
    }

//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping
//    public OrderDto createOrder(@RequestBody OrderDto order) {
//        return order;
//    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderDto> updateOrder(@PathVariable long id, @RequestBody OrderDto order) {
        return ResponseEntity.ok(order);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable long id) {
        return ResponseEntity.noContent().build();
    }
}











