package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private LocalDateTime orderDate;
    private LocalDate deliveryDate;

    public OrderRequest(final User user, final LocalDateTime orderDate,
                        final LocalDate deliveryDate) {
        this.user = user;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }
}
