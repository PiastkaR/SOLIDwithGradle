package com.pattern.dependencyinjection.vehicle;

public class Vehicle {
	
	private Engine myEngine;

	public Vehicle (Engine myEngine){
		this.myEngine = myEngine;
	}

	public void crankIgnition(){
		myEngine.startEngine();
		System.out.println("Vehicle is running");
	}
	
}
