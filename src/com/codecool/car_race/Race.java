package com.codecool.car_race;

import java.util.ArrayList;
import java.util.List;

public class Race {

    List<Vehicle> vehicles = new ArrayList<>();

    private boolean rainingNow;

    public void simulateRace() {
        Weather weather = new Weather();
        for (int i = 0; i < 50; i++) {
            rainingNow = weather.isRaining();
            for (Vehicle vehicle : vehicles
            ) {
                vehicle.prepareForLap(this);
                vehicle.moveForAnHour();
            }
        }
    } // simulates the race by
    // - calling moveForAnHour() on every vehicle 50 times
    // - setting whether its raining

    public boolean isRainingNow() {
        return rainingNow;
    }

    public void printRaceResults() {
        for (Vehicle vehicle : vehicles
             ) {
            StringBuilder sb = new StringBuilder();
            String name = vehicle.getName();
            int distance = vehicle.getDistanceTraveled();
            String type = vehicle.getType();
            String toPrint = sb.append(name).append(" ").append(distance).append(" ").append(type).toString();
            System.out.println(toPrint);
        }
    } // prints each vehicle's name, distance traveled and type.

    public boolean isThereABrokenTruck() {
        for (int i = 0; i < 10; i++) {
            Vehicle truck = vehicles.get(i);
            if (truck.isBrokenDown()) {
                return true;
            }
        }
        return false;
    } // returns true if there is a broken truck on track
}
