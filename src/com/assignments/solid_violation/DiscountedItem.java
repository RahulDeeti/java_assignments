package com.assignments.solid_violation;

public class DiscountedItem {
    private String name;
    private double price;
    private double discount;

    public DiscountedItem(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public double getDiscountedPrice() {
        return price - (price * discount);
    }
}
