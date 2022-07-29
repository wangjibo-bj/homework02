package com.cec.practice.service.impl;


import java.util.Date;

import com.cec.practice.model.Customer;
import com.cec.practice.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer selectOneById(Long id) {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName(this.getClass().getName());
        customer.setMember(Thread.currentThread().getName());
        customer.setCreateTime(new Date());
        return customer;
    }
}
