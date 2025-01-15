package dev.naimsulejmani.gr3cacttusordersystem.mappers;

import dev.naimsulejmani.gr3cacttusordersystem.dtos.ProductDto;
import dev.naimsulejmani.gr3cacttusordersystem.entities.ProductEntity;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Primary;

@Primary
@Mapper(componentModel = "spring")
public interface ProductMapper extends SimpleMapper<ProductEntity, ProductDto> {

}
