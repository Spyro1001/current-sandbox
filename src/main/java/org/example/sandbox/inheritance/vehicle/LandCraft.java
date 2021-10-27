package org.example.sandbox.inheritance.vehicle;

public abstract class LandCraft extends Vehicle {

    protected int grossVehicleWeightRating;

    public int getGrossVehicleWeightRating() {
        return grossVehicleWeightRating;
    }

    public void setGrossVehicleWeightRating(int grossVehicleWeightRating) {
        this.grossVehicleWeightRating = grossVehicleWeightRating;
    }

    @Override
    public void transport() {
        System.out.println("Transporting land-craft stuff.");
    }

    public void accellerate() {
        System.out.println("Landcraft accelerating.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LandCraft{");
        sb.append("grossVehicleWeightRating=").append(grossVehicleWeightRating);
        sb.append(", loadCapacity=").append(loadCapacity);
        sb.append('}');
        return sb.toString();
    }
}
