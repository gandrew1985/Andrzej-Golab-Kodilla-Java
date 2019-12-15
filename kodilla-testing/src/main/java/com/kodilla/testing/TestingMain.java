package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumuser");

        String result = simpleUser.getUserName();

        if(result.equals("theForumuser")) {
            System.out.println("Test ok");
        } else {
            System.out.println("Error");
        }
        //Calculator test:
        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(10, 5);
        int resultSub = calculator.subtract(7,2);

        if((resultAdd == 15) && (resultSub == 5)) {
            System.out.println("Calculator Test OK!");
        } else {
            System.out.println("Calculator test wrong");
        }
    }
}
