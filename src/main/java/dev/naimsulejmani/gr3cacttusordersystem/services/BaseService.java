package dev.naimsulejmani.gr3cacttusordersystem.services;

import java.util.List;

public interface BaseService<T, TId> {
    List<T> findAll();

    T findById(TId id);

    T add(T dto);

    T modify(TId id, T dto);

    void removeById(TId id);

}
