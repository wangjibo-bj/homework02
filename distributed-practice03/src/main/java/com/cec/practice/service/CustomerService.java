package com.cec.practice.service;

import com.cec.practice.model.Customer;

public interface CustomerService {
    Customer selectOneById(Long id);
}
