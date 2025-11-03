package org.example.starter.utils;

import java.util.Random;

/**
 * Utility class for random numbers
 */
public final class RandomNumber {

    private static final Random RNG = new Random();

    private RandomNumber() {
    }

    public static Random getRNG() {

        return RNG;
    }

    public static int getFromRange(int from, int to) {

        return RNG.nextInt(from, to + 1);
    }

    public static double getFromRange(double from, double to) {

        return from + (to - from) * RNG.nextDouble();
    }
}
