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

            }
        }
    } // simulates the race by
    // - calling moveForAnHour() on every vehicle 50 times
    // - setting whether its raining

    public boolean isRainingNow() {
        return rainingNow;
    }

    public void printRaceResults() {

    } // prints each vehicle's name, distance traveled and type.

    public boolean isThereABrokenTruck() {
        return true;
    } // returns true if there is a broken truck on track
}
