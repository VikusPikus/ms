package com.example.demoDocWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoDocWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDocWebApplication.class, args);
	}

}
