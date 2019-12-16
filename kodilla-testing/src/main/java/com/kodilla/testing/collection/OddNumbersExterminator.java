package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    private ArrayList<Integer> evenNumber;

    public OddNumbersExterminator() {
        evenNumber = new ArrayList<Integer>();
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        if(numbers.isEmpty()) {
            return numbers;
        } else {
            for(Integer number : numbers) {
                if(number % 2 == 0) {
                    evenNumber.add(number);
                }
            }
            return evenNumber;
        }
    }
}


