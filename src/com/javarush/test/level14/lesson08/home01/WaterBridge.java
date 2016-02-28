package com.javarush.test.level14.lesson08.home01;

/**
 * Created by Home on 21.02.2016.
 */
public class WaterBridge implements Bridge {
    private final int CARS = 20;

    @Override
    public int getCarsCount() {
        return CARS;
    }
}

