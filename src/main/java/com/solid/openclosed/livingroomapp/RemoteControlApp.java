package com.solid.openclosed.livingroomapp;

import com.solid.openclosed.livingroomapp.devices.Projector;
import com.solid.openclosed.livingroomapp.devices.SurroundSoundSystem;
import com.solid.openclosed.livingroomapp.remote.RemoteControl;

public class RemoteControlApp {
    public static void main(String[] args) {
        Projector projector = new Projector();
        SurroundSoundSystem surroundSoundSystem = new SurroundSoundSystem();
        RemoteControl remoteControl = RemoteControl.getInstance();

        remoteControl.connectToDevice(projector);
        remoteControl.clickOnButton();

        remoteControl.connectToDevice(surroundSoundSystem);
        remoteControl.clickOnButton();

        remoteControl.clickOffButton();
    }
}
