package com.codecool.car_race;

import java.util.Random;

abstract class Vehicle {

    int actualSpeed;
    int normalSpeed;
    int distanceTraveled = 0;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    String name;
    String type;

    public Vehicle() {
        setName();
        setNormalSpeed();
        setType();
        actualSpeed = normalSpeed;
    }

    abstract void prepareForLap(Race race);

    abstract void setName();

    abstract void setType();



    void setNormalSpeed() {
        normalSpeed = 100;
    }

    void moveForAnHour() {
        distanceTraveled += actualSpeed;
    }

    int getDistanceTraveled() {
        return distanceTraveled;
    }

    boolean isBrokenDown() {
        if (actualSpeed == 0) {
            return true;
        }
        return false;
    }
}
