package com.cec.practice.service;

import com.cec.practice.model.CoffeeOrder;

public interface CoffeeOrderService {
	
    CoffeeOrder selectOneById(Long id);
}
