package com.kodilla.spring.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(10.0, 5.0);
        double sub = calculator.sub(10.0, 5.0);
        double mul = calculator.mul(10.0, 5.0);
        double div = calculator.div(10.0, 5.0);
        //Then
        assertEquals(15.0, add, 0.0);
        assertEquals(5.0, sub, 0.0);
        assertEquals(50.0, mul, 0.0);
        assertEquals(2.0, div, 0.0);
    }
}