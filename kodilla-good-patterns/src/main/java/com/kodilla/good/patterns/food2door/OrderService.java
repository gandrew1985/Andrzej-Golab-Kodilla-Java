package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface OrderService {
    boolean order(User user, Product product, LocalDateTime orderDate, LocalDate deliveryDate);
}