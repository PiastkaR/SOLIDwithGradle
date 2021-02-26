package com.solid.openclosed.hospital;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class Doctor extends Employee {
    public Doctor(long id, String name, String department, boolean working) {
        super(id, name, department, working);
    }

    private void diagnosePatients() {
        log.info("diagnosePatients");
    }

    private void prescribeMedicine() {
        log.info("prescribeMedicine");
    }

    @Override
    public void performDuties() {
        diagnosePatients();
        prescribeMedicine();
    }
}
