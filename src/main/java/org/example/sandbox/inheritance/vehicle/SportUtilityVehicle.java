package org.example.sandbox.inheritance.vehicle;

public abstract class SportUtilityVehicle extends LandCraft implements FourWheelDrive {

    protected int towingCapacity;

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SportUtilityVehicle{");
        sb.append("grossVehicleWeightRating=").append(grossVehicleWeightRating);
        sb.append(", towingCapacity=").append(towingCapacity);
        sb.append(", loadCapacity=").append(loadCapacity);
        sb.append('}');
        return sb.toString();
    }
}
