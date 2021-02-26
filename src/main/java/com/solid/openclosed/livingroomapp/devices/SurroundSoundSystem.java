package com.solid.openclosed.livingroomapp.devices;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class SurroundSoundSystem implements Device {
    public void sound() {
        log.info("SurroundSoundSystem is working...");
    }

    @Override
    public void turnOn() {
        log.info("SurroundSoundSystem on");
    }

    @Override
    public void turnOff()  {
        log.info("SurroundSoundSystem off");
    }
}
