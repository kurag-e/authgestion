package com.perfulandia.authgestion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.perfulandia.authgestion"})
public class AuthgestionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthgestionApplication.class, args);
	}
	

}
