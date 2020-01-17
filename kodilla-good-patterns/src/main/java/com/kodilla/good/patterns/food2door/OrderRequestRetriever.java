package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Mark", "Carrick");
        Product product = new Product("Breads", 10);

        LocalDateTime orderDate = LocalDateTime.of(2020, 1, 10, 10, 55);
        LocalDate deliveryDate = LocalDate.of(2020, 1, 14);

        return new OrderRequest(user, product, orderDate, deliveryDate);
    }
}