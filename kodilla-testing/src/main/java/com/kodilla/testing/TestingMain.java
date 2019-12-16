package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

       int resultAdd = calculator.add(10,5);
       int resultSub = calculator.subtract(7,2);

       if((resultAdd == 15) && (resultSub == 5)) {
           System.out.println("Test calculator ok!");
        } else {
           System.out.println("Calculator error");
        }
    }
}
