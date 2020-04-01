package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class TomatoDecorator extends AbstractPizzaOrderDecorator {

    public TomatoDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(2));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + tomato";
    }
}
