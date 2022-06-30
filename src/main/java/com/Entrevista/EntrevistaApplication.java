package com.Entrevista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EntrevistaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntrevistaApplication.class, args);
	}

}
