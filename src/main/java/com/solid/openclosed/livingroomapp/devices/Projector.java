package com.solid.openclosed.livingroomapp.devices;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class Projector implements Device { //SINGLETON PATTERN:

    public void project() {
        log.info("Projector is projecting...");
    }

    @Override
    public void turnOn() {
        log.info("Projector is on");
    }

    @Override
    public void turnOff() {
        log.info("Projector is off");
    }
}
