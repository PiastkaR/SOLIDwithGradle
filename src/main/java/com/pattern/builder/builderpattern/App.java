package com.pattern.builder.builderpattern;

import com.pattern.builder.builderpattern.builderpattern.vehicle.Vehicle;

public class App {
    public static void main(String args[]) {

        User websiteUser = new User.Builder("bobMax", "bobMax@gmail.com")
                .firstName("bob").lastName("max").build();

        System.out.println(websiteUser);

        Vehicle vehicle = Vehicle.builder()
                .model("XC90")
                .type("Sedan")
                .color("red")
                .price(123454.788)
                .build();
        System.out.println("Car1: " + vehicle);

        Vehicle.VehicleBuilder vehicleBuilder = vehicle.toBuilder();

        vehicleBuilder
                .model("XC60")
                .type("Kombi")
                .color("red")
                .price(5678.0)
                .build();

        System.out.println("Car2: " + vehicleBuilder);

        vehicle.toBuilder()
                .model("XC`150`")
                .type("Car1 changed by toBuilder")
                .color("123")
                .price(123123)
                .build();
        System.out.println("Car1 CHANGED: " + vehicleBuilder);
    }
}