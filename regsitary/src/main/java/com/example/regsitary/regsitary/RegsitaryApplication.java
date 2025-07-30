package com.example.regsitary.regsitary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegsitaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegsitaryApplication.class, args);
	}

}
