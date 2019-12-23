package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class BookDirectoryTestSuite {

    @Test
    public void testListBooksWithConditionsReturnList() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBook = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBook.add(book1);
        resultListOfBook.add(book2);
        resultListOfBook.add(book3);
        resultListOfBook.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBook);
        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
        //Then
        assertEquals(4,theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        assertTrue(false);
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        assertTrue(false);
    }

}