package org.example.sandbox.inheritance.vehicle;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        Vehicle boat = new Boat();
        Vehicle ship = new Ship();

        Vehicle car = new Car();
        Vehicle grandCherokee = new GrandCherokee();
        Vehicle jeep = new Jeep();
        Vehicle truck = new Truck();
        Vehicle wrangler = new Wrangler();

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(boat);
        vehicles.add(ship);
        vehicles.add(car);
        vehicles.add(grandCherokee);
        vehicles.add(jeep);
        vehicles.add(truck);
        vehicles.add(wrangler);

        //vehicles.forEach(System.out::println);

        vehicles.forEach(v -> {

            // dynamic polymorphism
            v.transport();

            if (v instanceof WaterCraft) {
                ((WaterCraft) v).launch();
            }

            if (v instanceof LandCraft) {
                ((LandCraft) v).accellerate();
            }
        });

        // static polymorphism
        System.out.println(new StringBuilder().append(ship).append(1));
    }
}
