package com.chukurnev.sprintbootdemon.service.impl;

import com.chukurnev.sprintbootdemon.repository.OrderRepository;
import com.chukurnev.sprintbootdemon.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Set<Integer> add(List<Integer> ids) {
        return orderRepository.add(ids) ;
    }

    @Override
    public Set<Integer> get() {
        return orderRepository.get();

    }
}
