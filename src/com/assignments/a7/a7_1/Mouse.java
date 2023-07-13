package com.assignments.a7.a7_1;

public class Mouse extends Rodent {
    public Mouse() {
        System.out.println("This is a Mouse.");
    }

    @Override
    public void makeSound() {
        System.out.println("Mouse squeaks.");
    }

    @Override
    public void performAction() {
        System.out.println("Mouse scurries around.");
    }
}
