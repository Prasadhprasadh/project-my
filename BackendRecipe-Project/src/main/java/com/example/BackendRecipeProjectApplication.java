package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;

@SpringBootApplication
@EnableSwagger2
public class BackendRecipeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendRecipeProjectApplication.class, args);
	}

}
