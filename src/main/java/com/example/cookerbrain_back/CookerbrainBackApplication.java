package com.example.cookerbrain_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class CookerbrainBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(CookerbrainBackApplication.class, args);
	}
}
