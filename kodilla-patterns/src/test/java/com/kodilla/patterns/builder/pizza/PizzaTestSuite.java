package com.kodilla.patterns.builder.pizza;

import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaTestSuite {

    @Test
    public void testPizzaNew() {
        //Given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("onion")
                .sauce("Spicy")
                .bottom("Thin")
                .ingredient("Ham")
                .ingredient("mushrooms")
                .build();
        System.out.println(pizza);
        //When
        int howManyIngredients = pizza.getIngredients().size();
        //Then
        assertEquals(3,howManyIngredients);


    }

}