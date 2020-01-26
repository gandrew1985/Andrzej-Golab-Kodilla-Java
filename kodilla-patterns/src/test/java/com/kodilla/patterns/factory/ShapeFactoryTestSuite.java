package com.kodilla.patterns.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeFactoryTestSuite {
    @Test
    public void testFactoryCircle() {
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape circle = factory.makeShape(ShapeFactory.CIRCLE);
        //Then
        assertEquals("The rounded circle", circle.getName());
        assertEquals(Math.PI * Math.pow(4.5, 2), circle.getArea(), 0);
    }

    @Test
    public void testFactorySquare() {
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape square = factory.makeShape(ShapeFactory.SQUARE);
        //Then
        assertEquals("The angular square", square.getName());
        assertEquals(Math.pow(7, 2), square.getArea(), 0);
    }

    @Test
    public void testFactoryRectangle() {
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape rectangle = factory.makeShape(ShapeFactory.RECTANGLE);
        //Then
        assertEquals("The long rectangle", rectangle.getName());
        assertEquals(15*2.5,rectangle.getArea(),0);
    }

    @Test
    public void testFactoryCircleOne() {
        //Given
        ShapeFactory shapeFactory = new ShapeFactory();
        //Then
        Shape circle1 = shapeFactory.makeShape(ShapeFactory.CIRCLE1);
        //Then
        assertEquals("The 2nd circle",circle1.getName());
        assertEquals(Math.PI*Math.pow(3.5,2),circle1.getArea(),0);
    }
}