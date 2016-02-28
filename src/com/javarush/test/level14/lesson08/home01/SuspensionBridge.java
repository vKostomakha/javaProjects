package com.javarush.test.level14.lesson08.home01;

/**
 * Created by Home on 21.02.2016.
 */
public class SuspensionBridge implements Bridge {

    private final int CARS = 10;

    @Override
    public int getCarsCount() {
        return CARS;
    }
}
