package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class HealthyShopOrderService implements OrderService {

    @Override
    public boolean order(User user, Product product, LocalDateTime orderDate, LocalDate deliveryDate) {
        System.out.println("Healthy Shop welcomes: " + user.getName() + " " + user.getSurname());
        System.out.println("Your order is: " + product.getQuantity() + " " + product.getProductType());
        System.out.println("Order was placed on: " + orderDate.toString());
        System.out.println("Estimated delivery date: " + deliveryDate.toString());
        return true;
    }
}