package com.solid.openclosed.hospital;

public class EmergencyRoomProcess {
    public static void main(String[] args) {
        HospitalManagement ERDirector = new HospitalManagement();

        Employee peggy = new Nurse(1, "Peggy", "emergency", true);
        Employee suzan = new Nurse(1, "SUzan", "emergency", true);

        ERDirector.callUpon(peggy);
        ERDirector.callUpon(suzan);
    }
}
