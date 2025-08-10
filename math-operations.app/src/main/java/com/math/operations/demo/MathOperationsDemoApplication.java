package com.math.operations.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class  MathOperationsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MathOperationsDemoApplication.class, args);
	}

}
