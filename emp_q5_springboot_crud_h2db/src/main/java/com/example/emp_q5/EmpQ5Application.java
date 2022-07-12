package com.example.emp_q5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication



@EntityScan("com.example.emp_q5.model")

public class EmpQ5Application {

	public static void main(String[] args) {
		SpringApplication.run(EmpQ5Application.class, args);
		System.out.print("hello");
	}

}
