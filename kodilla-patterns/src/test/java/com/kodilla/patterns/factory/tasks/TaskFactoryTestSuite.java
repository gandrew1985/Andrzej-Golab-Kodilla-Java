package com.kodilla.patterns.factory.tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory task = new TaskFactory();
        //When
        Task shopping = task.makeShape(TaskFactory.SHOPPING);
        shopping.executeTask();
        //
        assertEquals("Weekend Shopping", shopping.getTaskName());
        assertFalse(shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory task = new TaskFactory();
        //When
        Task painting = task.makeShape(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        assertEquals("Roller painting", painting.getTaskName());
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory task = new TaskFactory();
        //When
        Task driving = task.makeShape(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        assertEquals("Give me a lift", driving.getTaskName());
        assertTrue(driving.isTaskExecuted());
    }
}