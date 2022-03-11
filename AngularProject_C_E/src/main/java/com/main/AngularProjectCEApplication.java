package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan
@SpringBootApplication
public class AngularProjectCEApplication {

	public static void main(String[] args) {
		System.out.println("This is Angular Project");
		SpringApplication.run(AngularProjectCEApplication.class, args);
	}

}
