package com.mvv.fatima.jsv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JsvAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsvAppApplication.class, args);
	}
}

@RestController
class DemoController{

	@GetMapping("/hello")
	public String hello(String name){
		return "Hello World, and hello to you to " + name;
	}
}