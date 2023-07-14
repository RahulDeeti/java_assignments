package com.assignments.a7.a7_4;

import com.assignments.a7.a7_4.factories.BicycleFactory;
import com.assignments.a7.a7_4.factories.UnicycleFactory;
import com.assignments.a7.a7_4.factories.TricycleFactory;

public class Main {
    public static void main(String[] args) {
        Cycle unicycle = new UnicycleFactory().createCycle();
        unicycle.display();

        Cycle bicycle = new BicycleFactory().createCycle();
        bicycle.display();

        Cycle tricycle = new TricycleFactory().createCycle();
        tricycle.display();
    }
}
