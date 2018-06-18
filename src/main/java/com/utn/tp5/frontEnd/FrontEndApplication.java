package com.utn.tp5.frontEnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.utn.tp5")
@SpringBootApplication
public class FrontEndApplication {

	public static final String urlApiRest = "http://localhost:8080/";
	public static void main(String[] args) {
		SpringApplication.run(FrontEndApplication.class, args);
	}
}
