package dev.naimsulejmani.gr3cacttusordersystem.mappers;

import dev.naimsulejmani.gr3cacttusordersystem.dtos.OrderDto;
import dev.naimsulejmani.gr3cacttusordersystem.entities.OrderEntity;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Primary;

@Primary
@Mapper(componentModel = "spring")
public interface OrderMapper extends SimpleMapper<OrderEntity, OrderDto> {
}
