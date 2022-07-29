package com.cec.practice.service.impl;


import java.util.Date;

import com.cec.practice.model.CoffeeOrder;
import com.cec.practice.service.CoffeeOrderService;

public class CoffeeOrderServiceImpl implements CoffeeOrderService {
    @Override
    public CoffeeOrder selectOneById(Long id) {
        CoffeeOrder coffeeOrder = new CoffeeOrder();
        coffeeOrder.setId(id);
        coffeeOrder.setCustomer(this.getClass().getName());
        coffeeOrder.setCreateTime(new Date());
        return coffeeOrder;
    }
}
