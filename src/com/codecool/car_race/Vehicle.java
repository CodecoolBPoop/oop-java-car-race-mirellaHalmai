package com.codecool.car_race;

import java.util.Random;

abstract class Vehicle {

    int actualSpeed;
    int normalSpeed;

    int distanceTraveled = 0;

    String name;

    public Vehicle() {
        setName();
        setNormalSpeed();
        actualSpeed = normalSpeed;
    }

    abstract void prepareForLap(Race race);

    abstract void setName();

    void setNormalSpeed() {
        normalSpeed = 100;
    }

    void moveForAnHour() {
        distanceTraveled += actualSpeed;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }
}
