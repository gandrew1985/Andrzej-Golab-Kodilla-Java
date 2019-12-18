package com.kodilla.testing.shape;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ShapeCollectorTest {
    private static int counter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Test Suit: begin");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("Test Suit: end");
    }

    @Before
    public void beforeTestCase() {
        counter++;
        System.out.println("Test case nr #" + counter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape circle = new Circle();
        //When
        collector.addFigure(circle);
        //Then
        assertEquals(1, collector.getSize());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape triangle = new Triangle();
        collector.addFigure(triangle);
        //When
        collector.removeFigure(triangle);
        //Then
        assertEquals(0, collector.getSize());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape circle = new Circle();
        collector.addFigure(circle);
        //When
        Shape retrievedShape;
        retrievedShape = collector.getFigure(0);
        //Then
        assertEquals(circle,retrievedShape);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();
        collector.addFigure(circle);
        collector.addFigure(triangle);
        collector.addFigure(square);
        //When
        collector.showFigures();
        Shape retrievedShape = collector.getFigure(0);
        //Then
        assertEquals(3, collector.getSize());
        assertEquals(circle, retrievedShape);
    }
}
