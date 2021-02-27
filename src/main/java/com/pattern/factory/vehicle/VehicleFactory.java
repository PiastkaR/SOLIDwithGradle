package com.pattern.factory.vehicle;

public class VehicleFactory {

    public Vehicle createVehicle(VehicleType vehicleType) {
        return vehicleType.getVehicle();
    }
}
