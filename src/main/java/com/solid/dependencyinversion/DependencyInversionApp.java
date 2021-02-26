package com.solid.dependencyinversion;

import com.solid.dependencyinversion.process.GeneralManufacturerProcess;
import com.solid.dependencyinversion.process.SmartPhoneManufacturingProcess;

public class DependencyInversionApp {
    public static void main(String[] args) {
        GeneralManufacturerProcess manufacturerProcess = new SmartPhoneManufacturingProcess("Iphone");
        manufacturerProcess.launchProcess();
    }
}
