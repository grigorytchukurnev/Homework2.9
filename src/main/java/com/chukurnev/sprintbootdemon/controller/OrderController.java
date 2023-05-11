package com.chukurnev.sprintbootdemon.controller;

import com.chukurnev.sprintbootdemon.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public Set<Integer> add(@RequestParam List<Integer> ids) {
        return orderService.add(ids) ;
    }

    @GetMapping("/get")
    public Set<Integer> get(){
        return orderService.get();
    }
}
