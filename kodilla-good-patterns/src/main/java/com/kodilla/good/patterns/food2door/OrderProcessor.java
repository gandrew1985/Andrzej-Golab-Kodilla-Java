package com.kodilla.good.patterns.food2door;

public class OrderProcessor {

    private OrderService orderService;

    public OrderProcessor(final OrderService orderService) {
        this.orderService = orderService;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct(),
                orderRequest.getOrderDate(), orderRequest.getDeliveryDate());

        if (isOrdered) {
            return new OrderDto(orderRequest.getUser(), true);
        }
        return new OrderDto(orderRequest.getUser(), false);
    }
}