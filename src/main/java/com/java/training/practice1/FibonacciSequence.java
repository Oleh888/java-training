package com.java.training.practice1;

public class FibonacciSequence {

    private int prev;

    /**
     * <p>Реализуйте метод `getFibonacciNumber(int n)` который возвращает число Фибоначи которое
     * стоит на `n` позиции в последовательности Фибоначчи (начало нумерации с нуля).</p>
     *
     * <p>Пример: n = 8
     * Результат: 21</p>
     */
    public int getFibonacciNumber(int index) {
        int[] sequence = new int[index + 2];
        int i;

        sequence[0] = 0;
        sequence[1] = 1;

        for (i = 2; i <= index; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }

        return sequence[index];
    }
}
