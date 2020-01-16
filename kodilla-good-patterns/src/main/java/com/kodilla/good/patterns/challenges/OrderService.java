package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface OrderService {

    boolean order(User user, LocalDateTime orderDate, LocalDate deliveryDate);
}
