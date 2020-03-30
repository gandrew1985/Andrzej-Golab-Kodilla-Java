package com.kodilla.good.patterns.food2door;

public class Product {

    private String productType;
    private int quantity;

    public Product(String productType, int quantity) {
        this.productType = productType;
        this.quantity = quantity;
    }

    public String getProductType() {
        return productType;
    }

    public int getQuantity() {
        return quantity;
    }
}