package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GlutenFreeShopOrderService implements OrderService {
    @Override
    public boolean order(User user, Product product, LocalDateTime orderDate, LocalDate deliveryDate) {
        System.out.println("Thanks for choosing GlutenFreeShop " + user.getName() + " " + user.getSurname());
        System.out.println("Your order of: " + product.getQuantity() + " " + product.getProductType());
        System.out.println("Was placed on: " + orderDate.toString() + " and will be delivered on:"
                + deliveryDate.toString());
        return true;
    }
}