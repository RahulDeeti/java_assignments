package com.assignments.solid_violation;

public class TaxableItem {
    private String name;
    private double price;
    private double taxRate;

    public TaxableItem(String name, double price, double taxRate) {
        this.name = name;
        this.price = price;
        this.taxRate = taxRate;
    }

    public String getName() {
        return name;
    }

    public double getPriceWithTax() {
        return price + (price * taxRate);
    }
}



