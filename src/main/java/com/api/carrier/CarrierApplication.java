package com.api.carrier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CarrierApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarrierApplication.class, args);
	}

}
