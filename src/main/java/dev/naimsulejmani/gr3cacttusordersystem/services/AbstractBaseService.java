package dev.naimsulejmani.gr3cacttusordersystem.services;

import dev.naimsulejmani.gr3cacttusordersystem.mappers.SimpleMapper;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@RequiredArgsConstructor
public abstract class AbstractBaseService<TDto, Tid, TEntity>
        implements BaseService<TDto, Tid> {

    private final JpaRepository<TEntity, Tid> repository;
    private final SimpleMapper<TEntity, TDto> mapper;


    @Override
    public List<TDto> findAll() {
        return mapper.toDtos(repository.findAll());
    }

    @Override
    public TDto findById(Tid id) {

        if (!repository.existsById(id))
            throw new EntityNotFoundException("Entity with id " + id + " not found");

        return mapper.toDto(repository.findById(id).orElse(null));
    }

    @Override
    public TDto add(TDto dto) {
        //validim a ekziston entity me qat id
//        if (repository.existsById(mapper.toEntity(dto).getId()))
//            throw new IllegalArgumentException("Entity with id " + mapper.toEntity(dto).getId() + " already exists");
        var entity = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public TDto modify(Tid id, TDto dto) {
        if (!repository.existsById(id))
            throw new EntityNotFoundException("Entity with id " + id + " not found");

        var entity = mapper.toEntity(dto);
        entity = repository.save(entity);
        return mapper.toDto(entity);
    }

    @Override
    public void removeById(Tid id) {
        if (!repository.existsById(id))
            throw new EntityNotFoundException("Entity with id " + id + " not found");
        repository.deleteById(id);
    }
}









