package com.assignments.solid_violation;

import java.util.ArrayList;
import java.util.List;

public class ViolationItem implements Printable {
    private List<Object> items;

    public ViolationItem() {
        items = new ArrayList<>();
    }

    public void addItem(Object item) {
        items.add(item);
    }

    public void removeItem(Object item) {
        items.remove(item);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Object item : items) {
            if (item instanceof Item) {
                total += ((Item) item).getPrice();
            } else if (item instanceof DiscountedItem) {
                total += ((DiscountedItem) item).getDiscountedPrice();
            } else if (item instanceof TaxableItem) {
                total += ((TaxableItem) item).getPriceWithTax();
            }
        }
        return total;
    }

    @Override
    public void printItems() {
        for (Object item : items) {
            if (item instanceof Item) {
                System.out.println(((Item) item).getName() + ": $" + ((Item) item).getPrice());
            } else if (item instanceof DiscountedItem) {
                System.out.println(((DiscountedItem) item).getName() + ": $" + ((DiscountedItem) item).getDiscountedPrice());
            } else if (item instanceof TaxableItem) {
                System.out.println(((TaxableItem) item).getName() + ": $" + ((TaxableItem) item).getPriceWithTax());
            }
        }
    }

    @Override
    public void printItemsToConsole() {
        // No implementation
        //Breaks interface seggreation principle
    }

}
