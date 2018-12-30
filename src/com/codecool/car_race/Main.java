package com.codecool.car_race;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    /**
     * Creates all the vehicles that will be part of this race.
     */
    private static void createVehicles(Race race) {
        for (int i = 0; i < 30; i++) {
            if (i < 10) {
                Vehicle truck = new Truck();
                race.vehicles.add(truck);
            } else if (i < 20) {
                Vehicle car = new Car();
                race.vehicles.add(car);
            } else {
                Vehicle motorcycle = new Motorcycle();
                race.vehicles.add(motorcycle);
            }

        }
    }

    /**
     * Entry point of our program. Creates one race instance and
     * uses that.
     * <p>
     *
     * @param args commandline arguments passed to the program.
     *             It is unused.
     */
    public static void main(String[] args) {
        Race race = new Race();
        createVehicles(race);

        race.simulateRace();
        race.printRaceResults();
    }
}
