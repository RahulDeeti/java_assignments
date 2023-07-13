package com.assignments.a7.a7_2;

public class Main {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[3];
        cycles[0] = new Unicycle();
        cycles[1] = new Bicycle();
        cycles[2] = new Tricycle();

        // Upcasting and calling balance() method
        for (Cycle cycle : cycles) {
            // Throws Compilation error because Cycle class doesn't have this method
//            cycle.balance();
        }

        //Downcasting
        for (Cycle cycle : cycles) {
            if (cycle instanceof Bicycle) {
                Bicycle bicycle = (Bicycle) cycle;
                bicycle.balance();
            } else if (cycle instanceof Unicycle) {
                Unicycle unicycle = (Unicycle) cycle;
                unicycle.balance();
            } else if (cycle instanceof Tricycle) {
                Tricycle tricycle = (Tricycle) cycle;
                // Throws Compilation error because Tricycle class doesn't have this method
//                tricycle.balance();
            }
        }
    }
}
