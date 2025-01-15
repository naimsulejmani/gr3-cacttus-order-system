package dev.naimsulejmani.gr3cacttusordersystem.services.impls;

import dev.naimsulejmani.gr3cacttusordersystem.dtos.OrderDto;
import dev.naimsulejmani.gr3cacttusordersystem.entities.OrderEntity;
import dev.naimsulejmani.gr3cacttusordersystem.mappers.OrderMapper;
import dev.naimsulejmani.gr3cacttusordersystem.repositories.OrderRepository;
import dev.naimsulejmani.gr3cacttusordersystem.services.AbstractBaseService;
import dev.naimsulejmani.gr3cacttusordersystem.services.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends AbstractBaseService<OrderDto, Long, OrderEntity>
        implements OrderService {

    public OrderServiceImpl(OrderRepository repository, OrderMapper mapper) {
        super(repository, mapper);
    }
}
