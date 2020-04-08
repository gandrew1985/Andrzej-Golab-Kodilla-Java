package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void testPublicationYearMedian() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Dylan Murphy", "Wolf of the mountain",
                2003, "0001"));
        bookSet.add(new Book("Phoebe Pearson", "Slaves of dreams",
                2012, "0002"));
        bookSet.add(new Book("Morgan Walsh", "Obliteration of heaven",
                2001, "0003"));
        bookSet.add(new Book("Aimee Murphy", "Rejecting the night",
                2015, "0004"));
        bookSet.add(new Book("Ryan Talley", "Gangsters and kings",
                2007, "0005"));
        bookSet.add(new Book("Madelynn Carson", "Unity without duty",
                2007, "0006"));
        bookSet.add(new Book("Giancarlo Guerrero", "Enemies of eternity",
                2009, "0007"));
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        System.out.println(median);
        assertEquals(2007, median);
    }
}