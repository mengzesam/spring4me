package com.mzs.authenticdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AuthenticdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticdemoApplication.class, args);
	}

	@GetMapping("/")
	public String hello(){
		return "hello";
	}


}
