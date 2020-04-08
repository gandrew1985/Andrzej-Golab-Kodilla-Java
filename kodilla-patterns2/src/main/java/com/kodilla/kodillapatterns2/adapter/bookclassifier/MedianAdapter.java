package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {


    private com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb.Book bookLibraryB;

    @Override
    public int publicationYearMedian(
            Set<com.kodilla.kodillapatterns2.adapter.bookclassifier.librarya.Book> bookSet) {

        Map<BookSignature, com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb.Book> bookMap =
                new HashMap<>();

        for (com.kodilla.kodillapatterns2.adapter.bookclassifier.librarya.Book book : bookSet) {
            BookSignature bookSignature = new BookSignature(book.getSignature());
            bookLibraryB = new com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb.Book(
                    book.getAuthor(),
                    book.getTitle(),
                    book.getPublicationYear());
            bookMap.put(bookSignature, bookLibraryB);
        }
        return medianPublicationYear(bookMap);
    }
}
