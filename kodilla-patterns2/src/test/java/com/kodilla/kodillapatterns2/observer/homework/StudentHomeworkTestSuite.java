package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentHomeworkTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Mentor adamKoziol = new Mentor("Adam", "Koziol");
        Mentor johnClark = new Mentor("John", "Clark");
        Student golab = new Student("Module 1", "Golab");
        Student smith = new Student("Module 2", "Smith");
        Student homework3 = new Student("Module 3", "Create Sudoku");
        golab.registerObserver(adamKoziol);
        smith.registerObserver(johnClark);
        //When
        golab.addHomework("Sleeping Knight");
        golab.addHomework("Snake");
        golab.addHomework("Sudoku");
        smith.addHomework("Snake");
        smith.addHomework("Sudoku");
        //Then
        assertEquals(3, adamKoziol.getUpdateCount());
        assertEquals(2, johnClark.getUpdateCount());
    }
}