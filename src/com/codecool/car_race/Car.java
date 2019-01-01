package com.codecool.car_race;

import java.util.*;

public class Car extends Vehicle {

    private static List<String> carNames = new ArrayList<>(Arrays.asList(
            "Might", "Inquiry", "Guardian", "Motion", "Blaze",
            "Astral", "Phenomenon", "Catalyst", "Inferno", "Supremacy",
            "Epiphany", "Sprite", "Viper", "Dusk", "Aurora",
            "Eternity", "Obsidian", "Legend", "Utopia", "Titan")
    );

    public Car() {
        super(Util.getRandomInt(80, 110));
    }

    // the normal speed of the car. Set to a random number in the constructor between 80-110km/h.

    @Override
    String createName() {
        Collections.shuffle(carNames);
        StringBuilder sb = new StringBuilder(carNames.get(0));
        return sb.append(" ").append(carNames.get(1)).toString();
    }

    @Override
    public String getType() {
        return "car";
    }

    // If there is a broken down Truck on the track, then limit the max speed of cars to 75 km/h.
    @Override
    void prepareForLap(Race race) {
        super.prepareForLap(race);
        if (race.isThereABrokenTruck()) {
            super.setActualSpeed(75);
        }
    } // setup the actual speed used for the current lap
}
