package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

//code here
@SpringBootApplication(scanBasePackages= {"com.example.demo","com.sales.controller","com.sales.proxy"})

public class SaleAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaleAppApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}