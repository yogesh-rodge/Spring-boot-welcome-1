package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@RestController
public class SpringBootThymleafDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootThymleafDemoApplication.class, args);
	}
	@RequestMapping( "/" )
	public String index() {
	
	return "welcome to spring-boot";
	}
}
