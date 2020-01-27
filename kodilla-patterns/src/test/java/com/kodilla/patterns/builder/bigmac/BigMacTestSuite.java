package com.kodilla.patterns.builder.bigmac;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BigMacTestSuite {
    @Test
    public void testBigMacBuilder() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("Sesame bun")
                .sauce("barbecue")
                .burgers(3)
                .ingredient("bacon")
                .ingredient("onion")
                .ingredient("tomato")
                .ingredient("cheese")
                .build();
        System.out.println(bigMac);
        //When
        int howManyIng = bigMac.getIngredients().size();
        String bun = bigMac.getBun();
        String sauce = bigMac.getSauce();
        int burgers = bigMac.getBurgers();
        //Then
        assertEquals(4, howManyIng);
        assertEquals("Sesame bun", bun);
        assertEquals("barbecue", sauce);
        assertEquals(3, burgers);
    }
}