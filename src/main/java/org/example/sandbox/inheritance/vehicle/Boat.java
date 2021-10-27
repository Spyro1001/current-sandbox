package org.example.sandbox.inheritance.vehicle;

public class Boat extends WaterCraft {

    @Override
    public void transport() {
        System.out.println("Transporting boat stuff.");
    }

    @Override
    public void launch() {
        System.out.println("Launching the boat.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Boat{");
        sb.append("loadCapacity=").append(loadCapacity);
        sb.append(", displacement=").append(displacement);
        sb.append('}');
        return sb.toString();
    }
}
