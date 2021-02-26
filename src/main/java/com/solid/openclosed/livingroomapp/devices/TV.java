package com.solid.openclosed.livingroomapp.devices;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class TV implements Device {
    public void changeChannel() {
        log.info("TV is changing channel...");
    }

    @Override
    public void turnOn() {
        log.info("TV on");
    }

    @Override
    public void turnOff()  {
        log.info("TV off");
    }
}
