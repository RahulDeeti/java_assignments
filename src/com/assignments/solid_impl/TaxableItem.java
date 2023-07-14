package com.assignments.solid_impl;

public class TaxableItem implements Item, Taxable {
    private Item item;
    private double taxRate;

    public TaxableItem(Item item, double taxRate) {
        this.item = item;
        this.taxRate = taxRate;
    }

    @Override
    public String getName() {
        return item.getName();
    }

    @Override
    public double getPrice() {
        return this.getPriceWithTax();
    }

    @Override
    public double getPriceWithTax() {
        return item.getPrice() + (item.getPrice() * taxRate);
    }
}
