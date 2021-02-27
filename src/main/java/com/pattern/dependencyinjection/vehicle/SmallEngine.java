package com.pattern.dependencyinjection.vehicle;

public class SmallEngine extends Engine {

    private int horsePower;

    public SmallEngine(String engineType, int horsePower) {
        super(engineType);
        this.horsePower = horsePower;
    }

    public void startEngine() {
        System.out.println("small engine started" + horsePower + "hp engine");
    }
}
