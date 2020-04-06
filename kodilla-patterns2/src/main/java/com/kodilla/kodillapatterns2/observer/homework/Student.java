package com.kodilla.kodillapatterns2.observer.homework;

public class Student extends HomeworkToCheck {

    private final String lastName;

    public Student(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}