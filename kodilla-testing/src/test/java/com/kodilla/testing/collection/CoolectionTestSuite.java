package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class CoolectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test case: begin");
    }
    @After
    public void after() {
        System.out.println("Test case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        ArrayList<Integer> numbersList = exterminator.exterminate(emptyList);
        System.out.println("Testing " + numbersList);
        //Then
        Assert.assertEquals(emptyList, numbersList);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList<Integer>(Arrays.asList(12,36,14,13,15));
        ArrayList<Integer> evenList = new ArrayList<>(Arrays.asList(12,36,14));
        //When
        ArrayList<Integer> numbersList = exterminator.exterminate(normalList);
        System.out.println("testing " + numbersList );
        //Then
        Assert.assertEquals(evenList,numbersList);
    }
}
