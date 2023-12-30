package com.example.NewYearCardProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class NewYearCardProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewYearCardProjectApplication.class, args);
	}

}
