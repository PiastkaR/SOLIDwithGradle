package com.pattern.factory;

import com.pattern.factory.vehicle.Vehicle;
import com.pattern.factory.vehicle.VehicleFactory;
import com.pattern.factory.vehicle.VehicleType;

public class App {
	public static void main(String args[]){
		VehicleFactory vehicleFactory = new VehicleFactory();
		
		Vehicle vehicle = vehicleFactory.getVehicle(VehicleType.CAR);
		vehicle.startEngine();
	}
}
