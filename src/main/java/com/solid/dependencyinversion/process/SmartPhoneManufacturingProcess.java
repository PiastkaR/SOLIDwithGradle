package com.solid.dependencyinversion.process;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@AllArgsConstructor
@Slf4j
public class SmartPhoneManufacturingProcess extends GeneralManufacturerProcess {

    private String name;

    @Override
    protected void assembleDevice() {
        log.info("assemble smartphone");
    }

    @Override
    protected void testDevice() {
        log.info("test smartphone");

    }

    @Override
    protected void packageDevice() {
        log.info("package smartphone");

    }

    @Override
    protected void storeDevice() {
        log.info("store smartphone");

    }
}
