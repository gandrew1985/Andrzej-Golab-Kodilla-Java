package com.kodilla.kodillapatterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class HomeworkToCheck implements Observable {

    private List<Observer> observers = new ArrayList<>();
    private Queue<String> homework = new ArrayDeque<>();
    private final String name;

    public HomeworkToCheck(String name) {
        this.name = name;
    }

    public void addHomework(String title) {
        homework.offer(title);
        notifyObserver();
    }

    public Queue<String> getHomeworkQueue() {
        return homework;
    }

    public String getName() {
        return name;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
