package com.kodilla.kodillapatterns2.observer.homework;

public class Mentor implements Observer {

    private final String firstName;
    private final String lastName;
    private int updateCount;

    public Mentor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void update(HomeworkToCheck homework) {
        System.out.println(firstName + " " + lastName + " New homework added to check" + "\n" +
                "(total " + homework.getHomeworkQueue().size() + " homework to check)");
        updateCount++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
