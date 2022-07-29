package com.cec.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cec.practice.model.Coffee;
import com.cec.practice.model.CoffeeOrder;
import com.cec.practice.model.Customer;
import com.cec.practice.service.CoffeeOrderService;
import com.cec.practice.service.CoffeeService;
import com.cec.practice.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class PracticeController {
    @Autowired
    private CoffeeService coffeeService;

    @Autowired
    private CoffeeOrderService coffeeOrderService;

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/coffee/one/{id}")
    @ResponseBody
    public Coffee getCoffeeById(@PathVariable Long id) {
        Coffee coffee = coffeeService.selectOneById(id);
        log.info("Coffee {}:", coffee);
        return coffee;
    }

    @GetMapping(value = "/coffeeOrder/one/{id}")
    @ResponseBody
    public CoffeeOrder getCoffeeOrderById(@PathVariable Long id){
        CoffeeOrder coffeeOrder = coffeeOrderService.selectOneById(id);
        log.info("CoffeeOrder {}:", coffeeOrder);
        return coffeeOrder;
    }

    @GetMapping(value = "/customer/one/{id}")
    @ResponseBody
    public Customer getCustomerById(@PathVariable Long id){
        Customer customer = customerService.selectOneById(id);
        log.info("Customer {}:", customer);
        return customer;
    }
}
