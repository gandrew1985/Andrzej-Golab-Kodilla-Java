package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BikeRepositoryService implements OrderRepository {

    @Override
    public boolean createOrder(User user, LocalDateTime orderDate, LocalDate deliveryDate) {
        System.out.println("Bike for: " + user.getUserName() + user.getUserSurname() + " on: " +
                orderDate.toString() + " deliver by: " + deliveryDate.toString());
        return true;
    }
}
