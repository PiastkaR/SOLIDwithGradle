package com.solid.openclosed.livingroomapp.remote;

import com.solid.openclosed.livingroomapp.devices.Device;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@ToString
public class RemoteControl {
    private Device device;

    private static final RemoteControl INSTANCE = new RemoteControl();

    public static RemoteControl getInstance(){
        return INSTANCE;
    }

    public void connectToDevice(Device aDevice){
        this.device = aDevice;
        log.info("---- connected to: "+ device + "----");
    }

    public void clickOffButton(){
        device.turnOff();
    }

    public void clickOnButton(){
        device.turnOn();
    }
}
