package dev.naimsulejmani.gr3cacttusordersystem.mappers;

import java.util.List;

public interface SimpleMapper<E, D> {
    D toDto(E entity);

    E toEntity(D dto);

    List<D> toDtos(List<E> entities);

    List<E> toEntities(List<D> dtos);
}
