package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExtraFoodShopOrderService implements OrderService {

    @Override
    public boolean order(User user, Product product, LocalDateTime orderDate, LocalDate deliveryDate) {
        System.out.println("Welcome " + user.getName() + " " + user.getSurname() + " in EXTRA FOOD SHOP!\n"
                + "Your order is " + product.getQuantity() +
                " " + product.getProductType() + "\nOrder date is: " + orderDate.toString() + " --- estimated delivery date: "
                + deliveryDate.toString());
        return true;
    }
}