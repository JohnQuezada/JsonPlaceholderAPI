package com.careerdevs.JsonPlaceholderAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JsonPlaceholderApiApplication {
	@GetMapping ("/")
	public String route() {
		return "you are home";
	}
	public static void main(String[] args) {
		SpringApplication.run(JsonPlaceholderApiApplication.class, args);
	}

}
