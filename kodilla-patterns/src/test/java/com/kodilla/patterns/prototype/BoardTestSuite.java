package com.kodilla.patterns.prototype;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class BoardTestSuite {

    @Test
    public void testToString() {
        //Given
        //creating the TaskList todo
        TaskList listToDo = new TaskList("To Do Tasks");
        IntStream.iterate(1,n -> n+1)
                .limit(10)
                .forEach(n->listToDo.getTasks().add(new Task("To Do Task number " + n)));

        //Creating the task list for task in progress
        TaskList listInProgress = new TaskList("In Progress Tasks");
        IntStream.iterate(1,n -> n+1)
                .limit(10)
                .forEach(n->listInProgress.getTasks().add(new Task("In Progress Task number " + n)));

        //Creating the task list for done
        TaskList listDone = new TaskList("Done Tasks");
        IntStream.iterate(1,n->n+1)
                .limit(10)
                .forEach(n->listDone.getTasks().add(new Task("Done Task number " + n)));

        //Creating the Board and assigning the list
        Board board = new Board("Project number 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);

        //making a shallow clone of object Board
        Board cloneBoard = null;
        try {
            cloneBoard = board.shallowCopy();
            cloneBoard.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object Board
        Board deepCloneBoard = null;
        try {
            deepCloneBoard = board.deepCopy();
            deepCloneBoard.setName("Project number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        board.getLists().remove(listToDo);
        //Then
        System.out.println(board);
        System.out.println(cloneBoard);
        System.out.println(deepCloneBoard);
        assertEquals(2,board.getLists().size());
        assertEquals(2,cloneBoard.getLists().size());
        assertEquals(3,deepCloneBoard.getLists().size());
        assertEquals(board.getLists().size(),cloneBoard.getLists().size());
        assertNotEquals(deepCloneBoard.getLists().size(), board.getLists().size());
    }
}