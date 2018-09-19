package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleJenkinsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleJenkinsProjectApplication.class, args);
	}
	
	@GetMapping("/")
	public String displayMessage() {
		return "Hello Jayanta, welcome to capgemini";
	}
}
