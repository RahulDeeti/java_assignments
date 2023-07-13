package com.assignments.a7.a7_4;

import com.assignments.a7.a7_4.factories.BicycleFactory;
import com.assignments.a7.a7_4.factories.UnicycleFactory;
import com.assignments.a7.a7_4.factories.TricycleFactory;

public class Main {
    public static void main(String[] args) {
        Cycle unicycle = UnicycleFactory.createUnicycle();
        unicycle.display();

        Cycle bicycle = BicycleFactory.createBicycle();
        bicycle.display();

        Cycle tricycle = TricycleFactory.createTricycle();
        tricycle.display();
    }
}
