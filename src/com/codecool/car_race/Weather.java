package com.codecool.car_race;

public class Weather {

    private boolean setRaining() {
        return Util.getRandomChance(30);
    } // 30% chance of rain.

    boolean isRaining() {
        return setRaining();
    } // is it raining currently.
}
