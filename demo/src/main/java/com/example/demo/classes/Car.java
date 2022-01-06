package com.example.demo.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.interfaces.Vehicle;

@Component
public class Car implements Vehicle{

	@Autowired
	private Tyre tyre;
	
	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	@Override
	public String drive() {
		return "Car is driving: "+tyre.toString();
		
	}

}
