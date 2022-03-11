package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@SpringBootApplication
public class AngularManagerProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngularManagerProjectApplication.class, args);
	}

}
