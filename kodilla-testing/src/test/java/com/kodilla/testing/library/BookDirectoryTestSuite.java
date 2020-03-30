package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for(int n =1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title" + n,"Author" + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

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
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);
        //When
        List<Book> theListOf0Books = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOf15Books = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOf40Books = bookLibrary.listBooksWithCondition("FortyBooks");
        //Then
        assertEquals(0,theListOf0Books.size());
        assertEquals(15,theListOf15Books.size());
        assertEquals(0,theListOf40Books.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultOf10Books);
        //When
        List<Book> theListOf10Books = bookLibrary.listBooksWithCondition("An");
        //Then
        assertEquals(0,theListOf10Books.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListOf0BorrowedBooksByLibraryUser() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Jan", "Kowalski","23455487654");
        List<Book> resultOf0BorrowedBooks = new ArrayList<>();
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultOf0BorrowedBooks);
        //When
        List<Book> listOf0Books = bookLibrary.listBooksInHandsOf(libraryUser);
        //Then
        assertEquals(0,listOf0Books.size());
    }

    @Test
    public void testListOf1BorrowedBookByLibraryUser() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("name","surname","pesel");
        List<Book> resultOf1BorrowedBook = generateListOfNBooks(1);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultOf1BorrowedBook);
        //When
        List<Book> listOf1Book = bookLibrary.listBooksInHandsOf(libraryUser);
        //Then
        assertEquals(1,listOf1Book.size());
    }

    @Test
    public void testListOf5BorrowedBooksByLibraryUser() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("name","surname","pesel");
        List<Book> resultOf5BorrowedBooks = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultOf5BorrowedBooks);
        //When
        List<Book> listOf5Books = bookLibrary.listBooksInHandsOf(libraryUser);
        //Then
        assertEquals(5,listOf5Books.size());

    }
}