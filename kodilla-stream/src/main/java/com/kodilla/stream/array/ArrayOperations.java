package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        return IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .map(ArrayOperations::showNumber)
                .average()
                .getAsDouble();

    }
    static int showNumber(int number) {
        System.out.println(number);
        return number;
    }
}
