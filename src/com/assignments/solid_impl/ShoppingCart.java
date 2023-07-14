package com.assignments.solid_impl;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements Printable {
    private List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + ": $" + item.getPrice());
        }
    }
}
