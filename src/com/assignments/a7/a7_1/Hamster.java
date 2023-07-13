package com.assignments.a7.a7_1;

public class Hamster extends Rodent {
    public Hamster() {
        System.out.println("This is a Hamster.");
    }

    @Override
    public void makeSound() {
        System.out.println("Hamster squeaks and purrs.");
    }

    @Override
    public void performAction() {
        System.out.println("Hamster runs on a wheel.");
    }
}
