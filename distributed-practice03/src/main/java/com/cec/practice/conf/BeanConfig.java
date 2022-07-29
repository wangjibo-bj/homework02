package com.cec.practice.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cec.practice.service.CustomerService;
import com.cec.practice.service.impl.CustomerServiceImpl;

@Configuration
public class BeanConfig {
    @Bean
    public CustomerService CustomerService(){
        return new CustomerServiceImpl();
    }
}
