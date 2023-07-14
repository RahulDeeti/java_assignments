package com.assignments.a7.a7_4.factories;
import com.assignments.a7.a7_4.Cycle;
import com.assignments.a7.a7_4.implementations.Unicycle;
public class UnicycleFactory implements CycleFactory {
    @Override
    public Cycle createCycle() {
        System.out.println("Creating a new unicycle.");
        return new Unicycle();
    }
}
