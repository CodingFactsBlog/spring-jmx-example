package com.wordpress.codingfactsblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class JmxApplication{
	
	public static void main(String[] args) {
		SpringApplication.run(JmxApplication.class, args);
	}
}