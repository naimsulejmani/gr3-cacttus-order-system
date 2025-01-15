package dev.naimsulejmani.gr3cacttusordersystem.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private long id;
    private LocalDate orderDate;
    private String employee;
    private String customer;
    private LocalDateTime createdAt;
    List<OrderDetailDto> details;
}











