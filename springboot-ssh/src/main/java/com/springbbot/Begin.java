package com.springbbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication  
@EnableTransactionManagement
public class Begin {

	public static void main(String[] args) {
		
		SpringApplication.run(Begin.class, args);

	}

}
