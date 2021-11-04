package com.java.training.practice1;

import java.util.stream.IntStream;

public class Factorial {

    /**
     * Реализуйте метод getFactorial(int number) который вовзращает факториал числа.
     */
    public int getFactorial(int number) {
        return IntStream.rangeClosed(2, number).reduce(1, (x, y) -> x * y);
    }
}
