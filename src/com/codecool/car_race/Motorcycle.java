package com.codecool.car_race;

public class Motorcycle extends Vehicle {

    // speed is 100km/h. If it rains, travels with 5-50km/h slower (randomly). Doesn't care about trucks.
    private static int numberOfMotorcycles = 0;

    private int motorcycleNumber; // The number of the instance created. Used for its name.

    @Override
    String createName() {
        motorcycleNumber = numberOfMotorcycles + 1;
        numberOfMotorcycles++;
        StringBuilder sb = new StringBuilder("Motorcycle ");
        return sb.append(motorcycleNumber).toString();
    }

    @Override
    public String getType() {
        return "motorcycle";
    }

    @Override
    void prepareForLap(Race race) {
        super.prepareForLap(race);
        if (race.isRainingNow()) {
            int actualSpeed = super.getNormalSpeed() - Util.getRandomInt(5, 50);
            super.setActualSpeed(actualSpeed);
        }
    } // setup the actual speed used for the current lap

}
