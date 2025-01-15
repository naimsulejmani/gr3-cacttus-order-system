package dev.naimsulejmani.gr3cacttusordersystem.mappers;

import dev.naimsulejmani.gr3cacttusordersystem.dtos.OrderDetailDto;
import dev.naimsulejmani.gr3cacttusordersystem.entities.OrderDetailEntity;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Primary;

@Primary
@Mapper(componentModel = "spring")
public interface OrderDetailMapper extends SimpleMapper<OrderDetailEntity, OrderDetailDto> {
}
