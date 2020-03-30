package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private Product product;
    private LocalDateTime orderDate;
    private LocalDate deliveryDate;

    public OrderRequest(final User user, final Product product, final LocalDateTime orderDate, final LocalDate deliveryDate) {
        this.user = user;
        this.product = product;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }
}