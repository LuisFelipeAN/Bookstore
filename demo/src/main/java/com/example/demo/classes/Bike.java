package com.example.demo.classes;

import org.springframework.stereotype.Component;

import com.example.demo.interfaces.Vehicle;

@Component
public class Bike implements Vehicle{

	@Override
	public String drive() {
		return "Bike is driving";
	}
	
}
