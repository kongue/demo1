package com.p.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Demo1Application {
	@GetMapping("/test")
	public String test(){
		return "demo1";
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
