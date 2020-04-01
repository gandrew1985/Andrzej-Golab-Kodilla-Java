package com.kodilla.kodillapatterns3.decorator.taxiporta;

import java.math.BigDecimal;

public interface TaxiOrder {
    BigDecimal getCost();
    String getDescription();
}
