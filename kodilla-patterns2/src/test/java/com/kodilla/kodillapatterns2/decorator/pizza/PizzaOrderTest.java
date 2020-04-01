package com.kodilla.kodillapatterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTest {

    @Test
    public void testPizzaOrderWithAllIngredientsGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new TomatoDecorator(theOrder);
        System.out.println("Price: " + theOrder.getPrice());
        //When
        BigDecimal thePrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(23), thePrice);
    }

    @Test
    public void testPizzaOrderWithAllIngredientsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new TomatoDecorator(theOrder);
        System.out.println(theOrder.getIngredients());
        //When
        String description = theOrder.getIngredients();
        //Then
        assertEquals("Base + tomato sauce + cheese + extra cheese + ham + mushrooms + tomato", description);
    }

}