package com.api.parkingcontroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.api.parkingcontroll")
@EnableJpaRepositories(basePackages = "com.api.parkingcontroll")
public class ParkingControllApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingControllApplication.class, args);
	}

}
