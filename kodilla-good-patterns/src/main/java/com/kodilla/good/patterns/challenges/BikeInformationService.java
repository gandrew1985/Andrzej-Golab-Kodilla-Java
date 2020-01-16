package com.kodilla.good.patterns.challenges;

public class BikeInformationService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Sending email to: " + user.getUserName() + " " + user.getUserSurname());
    }
}
