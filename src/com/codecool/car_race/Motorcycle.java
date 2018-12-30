package com.codecool.car_race;

public class Motorcycle extends Vehicle {

    // speed is 100km/h. If it rains, travels with 5-50km/h slower (randomly). Doesn't care about trucks.
    private static int numberOfMotorcycles = 0;

    private int motorcycleNumber; // The number of the instance created. Used for its name.

    @Override
    void setName() {
        motorcycleNumber = numberOfMotorcycles + 1;
        numberOfMotorcycles++;
        StringBuilder sb = new StringBuilder();
        name = sb.append("Motorcycle ").append(motorcycleNumber).toString();
    }

    @Override
    void prepareForLap(Race race) {
        if (race.isRainingNow()) {
            int speedDiff = Util.getRandomInt(5, 50);
            actualSpeed -= speedDiff;
        }
    } // setup the actual speed used for the current lap

}
