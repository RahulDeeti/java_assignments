package com.assignments.solid_impl;

public class Main {
    public static void main(String[] args) {
        BasicItem basicItem1 = new BasicItem("discounted Item", 200);
        BasicItem basicItem2 = new BasicItem("taxable item", 100);

        Item discountedItem = new DiscountedItem(basicItem1, 0.5);
        Item taxableItem = new TaxableItem(basicItem2, 0.5);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(discountedItem);
        shoppingCart.addItem(taxableItem);
        double totalPrice = shoppingCart.calculateTotalPrice();
        System.out.println("Total value of your purchase is: "+totalPrice);

    }
}
