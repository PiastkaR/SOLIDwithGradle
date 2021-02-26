package com.solid.openclosed.hospital;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HospitalManagement {
//STRATEGY PATTERN;///
    public void callUpon(Employee employee) {
        employee.performDuties();
    }
}
