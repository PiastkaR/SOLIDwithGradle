package com.pattern.builder.builderpattern.builderpattern.vehicle;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@Getter
@Builder(toBuilder = true)
@ToString
public class Vehicle {
    @NonNull
    private String type;
    private String make;
    private String model;
    private double price;
    private int doors;
    private String color;
    private int horsePower;

    public static Vehicle vehicleBuilder() {
        return Vehicle.builder().build();
    }
}
