package com.kodilla.stream.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[]{12, 23, 56, 4, 5, 87, 27, 35, 78, 22, 33, 36, 12, 18, 23, 56, 7, 2, 9, 1};
        //When
        double resultAverage = ArrayOperations.getAverage(numbers);
        //Then
        assertEquals(27.3, resultAverage,0);
    }
}