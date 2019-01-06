package com.bitbank;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.bitbank.dao")
@SpringBootApplication
public class BstApplication {

	public static void main(String[] args) {
		SpringApplication.run(BstApplication.class, args);
	}

}

