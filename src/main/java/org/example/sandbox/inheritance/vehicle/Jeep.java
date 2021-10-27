package org.example.sandbox.inheritance.vehicle;

public class Jeep extends SportUtilityVehicle {

    @Override
    public void transport() {
        System.out.println("Transporting jeep stuff.");
    }

    @Override
    public void engage4WD() {
        System.out.println("Engaging 4WD");
    }

    @Override
    public void disengage4WD() {
        System.out.println("Disengaging 4WD");
    }
}
