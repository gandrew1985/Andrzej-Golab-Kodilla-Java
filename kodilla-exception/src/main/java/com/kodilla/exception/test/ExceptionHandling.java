package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2, 3);
        } catch (Exception e) {
            System.out.println("Im throwing a new Exception: " + e);
        } finally {
            System.out.println("Im here");
        }
    }
}