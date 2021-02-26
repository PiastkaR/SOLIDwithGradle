package com.solid.dependencyinversion.process;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@AllArgsConstructor
public abstract class GeneralManufacturerProcess {

    private String processName;

    protected abstract void assembleDevice();

    protected abstract void testDevice();

    protected abstract void packageDevice();

    protected abstract void storeDevice();

    public void launchProcess() { //TEMPLATE PATTERN:
        if (processName != null && !processName.isEmpty()) {
            assembleDevice();
            testDevice();
            packageDevice();
            storeDevice();
        } else {
            log.info("No process name within specification!");
        }
    }
}
