package org.example.sandbox.inheritance.vehicle;

public abstract class Vehicle implements Conveyance {

    protected int loadCapacity;

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicle{");
        sb.append("loadCapacity=").append(loadCapacity);
        sb.append('}');
        return sb.toString();
    }
}
