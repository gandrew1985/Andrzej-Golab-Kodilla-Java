package com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb;

import java.util.Objects;

public class BookSignature {

    private final String signature;

    public BookSignature(final String signature) {
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookSignature that = (BookSignature) o;
        return Objects.equals(signature, that.signature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(signature);
    }

    @Override
    public String toString() {
        return "BookSignature{" +
                "signature='" + signature + '\'' +
                '}';
    }
}
