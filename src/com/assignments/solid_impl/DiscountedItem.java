package com.assignments.solid_impl;

public class DiscountedItem implements Item, Discountable {
    private Item item;
    private double discount;

    public DiscountedItem(Item item, double discount) {
        this.item = item;
        this.discount = discount;
    }

    @Override
    public String getName() {
        return item.getName();
    }

    @Override
    public double getPrice() {
        return this.getDiscountedPrice();
    }

    @Override
    public double getDiscountedPrice() {
        return item.getPrice() - (item.getPrice() * discount);
    }
}
