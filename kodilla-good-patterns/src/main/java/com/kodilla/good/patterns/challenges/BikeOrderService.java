package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BikeOrderService implements OrderService {

    @Override
    public boolean order(final User user, final LocalDateTime bikeOrderDate, final LocalDate bikeDeliveryDate) {
        System.out.println("Bike ordered by " + user.getUserName() + " " + user.getUserSurname() +
                " on: " + bikeOrderDate.toString() + "\nEstimated delivery date: " + bikeDeliveryDate.toString());
        return true;
    }
}
