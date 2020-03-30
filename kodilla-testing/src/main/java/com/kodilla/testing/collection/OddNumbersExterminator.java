package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumber = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumber.add(number);
            }
        }
        return evenNumber;
    }
}


