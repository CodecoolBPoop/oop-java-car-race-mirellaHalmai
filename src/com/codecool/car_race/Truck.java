package com.codecool.car_race;

public class Truck extends Vehicle {

    private int breakdownTurnsLeft = 0; // holds how long it's still broken down.

    // Truck drivers are boring. They call all their trucks a random number between 0 and 1000.
    @Override
    String createName() {
        return String.valueOf(Util.getRandomInt(0, 1000));
    }

    // 5% chance of breaking down for 2 turns.
    @Override
    public String getType() {
        return "truck";
    }

    @Override
    void prepareForLap(Race race) {
        if (breakdownTurnsLeft > 0) {
            breakdownTurnsLeft--;
        } else if (Util.getRandomChance(5)) {
            super.setActualSpeed(0);
            breakdownTurnsLeft = 1;
        } else {
            super.prepareForLap(race);
        }
    }
}
