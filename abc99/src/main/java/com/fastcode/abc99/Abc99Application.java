package com.fastcode.abc99;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.fastcode.abc99"})
public class Abc99Application {

	public static void main(String[] args) {
		SpringApplication.run(Abc99Application.class, args);
	}

}

