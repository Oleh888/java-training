package com.java.training.practice1;

public class StringSumDigits {

    /**
     * Given a string, return the sum of the digits 0-9 that appear in the string,
     * ignoring all other characters. Return 0 if there are no digits in the string.
     */
    public int sumDigits(String str) {
        return str.chars()
                .filter(Character::isDigit).map(it -> it - '0')
                .sum();
    }
}
