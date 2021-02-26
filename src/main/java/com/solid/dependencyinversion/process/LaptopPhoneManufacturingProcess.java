package com.solid.dependencyinversion.process;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@AllArgsConstructor
@Slf4j
public class LaptopPhoneManufacturingProcess extends GeneralManufacturerProcess {

    private String name;

    @Override
    protected void assembleDevice() {
        log.info("assemble laptop");
    }

    @Override
    protected void testDevice() {
        log.info("test laptop");

    }

    @Override
    protected void packageDevice() {
        log.info("package laptop");

    }

    @Override
    protected void storeDevice() {
        log.info("store laptop");

    }
}
