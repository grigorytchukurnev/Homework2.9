package com.chukurnev.sprintbootdemon.service;

import java.util.List;
import java.util.Set;

public interface OrderService {


    Set<Integer> add(List<Integer> ids);

    Set<Integer> get();
}
