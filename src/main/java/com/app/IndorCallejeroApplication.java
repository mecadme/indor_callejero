package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.app.persistence.entity")
public class IndorCallejeroApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndorCallejeroApplication.class, args);
	}

}
