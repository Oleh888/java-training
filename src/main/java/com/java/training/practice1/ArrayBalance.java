package com.java.training.practice1;

import java.util.stream.IntStream;

public class ArrayBalance {

    /**
     * Given an array, return true if there is a place to split the array so that
     * the sum of the numbers on one side is equal to the sum of the numbers on the
     * other side.
     */
    public boolean canBalance(int[] array) {
        int sum = IntStream.of(array).sum();

        int currentSum = 0;
        for (int i : array) {
            currentSum += i;
            if (sum - currentSum == currentSum) {
                return true;
            }
        }

        return false;
    }

}
