package com.cec.practice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.cec.practice.mapper")
public class DistributedPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistributedPracticeApplication.class, args);
	}

	

}
