package com.codecool.car_race;

import java.util.*;

public class Car extends Vehicle {

    // If there is a broken down Truck on the track, then limit the max speed of cars to 75 km/h.
    private List<String> carNames = new ArrayList<String>(Arrays.asList(
            "Might", "Inquiry", "Guardian", "Motion", "Blaze",
            "Astral", "Phenomenon", "Catalyst", "Inferno", "Supremacy",
            "Epiphany", "Sprite", "Viper", "Dusk", "Aurora",
            "Eternity", "Obsidian", "Legend", "Utopia", "Titan")
    );

    // the normal speed of the car. Set to a random number in the constructor between 80-110km/h.

    @Override
    void setName() {
        Collections.shuffle(carNames);
        StringBuilder sb = new StringBuilder();
        name = sb.append(carNames.get(0)).append(carNames.get(1)).toString();
    }

    @Override
    void setNormalSpeed() {
        normalSpeed = Util.getRandomInt(80, 110);
    }

    @Override
    void prepareForLap(Race race) {
        if (race.isThereABrokenTruck()) {
            actualSpeed = 75;
        }
    } // setup the actual speed used for the current lap
}
