package org.example.starter.utils;

import java.util.Random;

/**
 * Utility class for random numbers
 */
public final class RandomNumbers {

    private static final Random RNG = new Random();

    private RandomNumbers() {
    }

    public static Random getRNG() {

        return RNG;
    }

    public static int getRandomNumberFromRange(int from, int to) {

        return RNG.nextInt(from, to + 1);
    }

    public static double getRandomNumberFromRange(double from, double to) {

        return from + (to - from) * RNG.nextDouble();
    }
}
