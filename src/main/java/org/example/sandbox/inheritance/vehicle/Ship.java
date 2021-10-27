package org.example.sandbox.inheritance.vehicle;

public class Ship extends WaterCraft {

    @Override
    public void transport() {
        System.out.println("Transporting ship stuff.");
    }

    @Override
    public void launch() {
        System.out.println("Launching the ship.");
    }
}
