package com.jfjara.resilienceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ResilienceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResilienceServiceApplication.class, args);
	}

}
