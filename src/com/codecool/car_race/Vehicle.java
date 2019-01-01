package com.codecool.car_race;

abstract class Vehicle {

    private int actualSpeed;
    private int normalSpeed = 100;
    private int distanceTraveled = 0;

    private String name;
    private String type;

    public Vehicle() {
        name = createName();
        type = getType();
    }

    public Vehicle(int normalSpeed) {
        name = createName();
        type = getType();
        this.normalSpeed = normalSpeed;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    void prepareForLap(Race race) {
        actualSpeed = normalSpeed;
    }

    abstract String createName();


    public void setActualSpeed(int actualSpeed) {
        this.actualSpeed = actualSpeed;
    }

    public int getNormalSpeed() {
        return normalSpeed;
    }

    void moveForAnHour() {
        distanceTraveled += actualSpeed;
    }

    int getDistanceTraveled() {
        return distanceTraveled;
    }

    boolean isBrokenDown() {
        return actualSpeed == 0;
    }
}
