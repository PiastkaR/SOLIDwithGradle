package com.solid.openclosed.hospital;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class Nurse extends Employee {
    public Nurse(long id, String name, String department, boolean working) {
        super(id, name, department, working);
    }

    private void checkVitalSigns() {
        log.info("Checking vitals...");
    }

    private void drawBlood() {
        log.info("drawBlood");
    }

    private void cleanPatientArea() {
        log.info("cleanPatientArea");
    }

    @Override
    public void performDuties() {
        checkVitalSigns();
        drawBlood();
        cleanPatientArea();
    }
}
