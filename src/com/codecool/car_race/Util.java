package com.codecool.car_race;

import java.util.Random;

public class Util {

    static int getRandomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    static boolean getRandomChance(int percent) {
        int chance = Util.getRandomInt(0, percent);
        if (chance < percent + 1) {
            return true;
        }
        return false;
    }
}
