package dev.naimsulejmani.gr3cacttusordersystem.services.impls;

import dev.naimsulejmani.gr3cacttusordersystem.dtos.ProductDto;
import dev.naimsulejmani.gr3cacttusordersystem.entities.ProductEntity;
import dev.naimsulejmani.gr3cacttusordersystem.mappers.ProductMapper;
import dev.naimsulejmani.gr3cacttusordersystem.repositories.ProductRepository;
import dev.naimsulejmani.gr3cacttusordersystem.services.AbstractBaseService;
import dev.naimsulejmani.gr3cacttusordersystem.services.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl
        extends AbstractBaseService<ProductDto, Long, ProductEntity>
        implements ProductService {


    public ProductServiceImpl(ProductRepository repository,
                              ProductMapper mapper) {
        super(repository, mapper);
    }
}
