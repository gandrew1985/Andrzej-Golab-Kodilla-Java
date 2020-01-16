package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user1 = new User("Mike", "Young");
        LocalDateTime orderedOn = LocalDateTime.of(2020, 1, 10, 10, 55);
        LocalDate expectedDelivery = LocalDate.of(2020, 1, 17);

        return new OrderRequest(user1, orderedOn, expectedDelivery);
    }
}
