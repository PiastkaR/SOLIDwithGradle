package com.pattern.singleton;

public class PerformanceStage {

    private static PerformanceStage INSTANCE = null;
    private static int COUNTER;

    private PerformanceStage() {
        COUNTER++;
    }

    public synchronized static PerformanceStage getInstance() { //synchronized for multithread safety
        if (INSTANCE == null) {
            INSTANCE = new PerformanceStage();
        }
        return INSTANCE;
    }

    public void turnOnLights() {
        System.out.println("light turned on....");
    }

    public int getCounter() {
        return COUNTER;
    }
}
