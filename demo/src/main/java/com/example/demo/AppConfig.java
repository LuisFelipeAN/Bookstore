package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.classes.Car;
import com.example.demo.classes.Tyre;

@Configuration
@ComponentScan(basePackages="com.example.demo.classes")
public class AppConfig {

	/*@Bean
	public Car getCar() {
		return new Car();
	}
	
	@Bean Tyre getTyre() {
		return new Tyre();
	}*/
}
